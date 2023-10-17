package ch.bbz.zins.aufgaben;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImperativeZinsen {
    String jsonString = "{\n" +
            "  \"months\": [\n" +
            "    {\n" +
            "      \"daysFrom1\": [0.01, 0.015, 0.01, 0.01, 0.02, 0.022, 0.019, 0.016, 0.015, 0.014, 0.013, 0.012, 0.011, 0.01, 0.009, 0.008, 0.007, 0.006, 0.005, 0.004, 0.003, 0.002, 0.001, 0.0, 0.001, 0.002, 0.003, 0.004, 0.005, 0.006]\n" +
            "    },\n" +
            "    {\n" +
            "      \"daysFrom2\": [0.005, 0.008, 0.01, 0.011, 0.013, 0.015, 0.016, 0.017, 0.018, 0.019, 0.02, 0.021, 0.022, 0.023, 0.024, 0.025, 0.026, 0.027, 0.028, 0.029, 0.03, 0.031, 0.032, 0.033, 0.034, 0.035, 0.036, 0.037, 0.038, 0.039]\n" +
            "    },\n" +
            "    {\n" +
            "      \"daysFrom3\": [0.01, 0.011, 0.012, 0.013, 0.014, 0.015, 0.016, 0.017, 0.018, 0.019, 0.02, 0.021, 0.022, 0.023, 0.024, 0.025, 0.026, 0.027, 0.028, 0.029, 0.03, 0.031, 0.032, 0.033, 0.034, 0.035, 0.036, 0.037, 0.038, 0.039]\n" +
            "    },\n" +
            "    {\n" +
            "      \"daysFrom4\": [0.015, 0.014, 0.013, 0.012, 0.011, 0.01, 0.009, 0.008, 0.007, 0.006, 0.005, 0.004, 0.003, 0.002, 0.001, 0.0, 0.001, 0.002, 0.003, 0.004, 0.005, 0.006, 0.007, 0.008, 0.009, 0.01, 0.011, 0.012, 0.013, 0.014]\n" +
            "    },\n" +
            "    {\n" +
            "      \"daysFrom5\": [0.02, 0.021, 0.022, 0.023, 0.024, 0.025, 0.026, 0.027, 0.028, 0.029, 0.03, 0.031, 0.032, 0.033, 0.034, 0.035, 0.036, 0.037, 0.038, 0.039, 0.04, 0.041, 0.042, 0.043, 0.044, 0.045, 0.046, 0.047, 0.048, 0.049]\n" +
            "    },\n" +
            "    {\n" +
            "      \"daysFrom6\": [0.025, 0.026, 0.027, 0.028, 0.029, 0.03, 0.031, 0.032, 0.033, 0.034, 0.035, 0.036, 0.037, 0.038, 0.039, 0.04, 0.041, 0.042, 0.043, 0.044, 0.045, 0.046, 0.047, 0.048, 0.049, 0.05, 0.051, 0.052, 0.053, 0.054]\n" +
            "    },\n" +
            "    {\n" +
            "      \"daysFrom7\": [0.03, 0.031, 0.032, 0.033, 0.034, 0.035, 0.036, 0.037, 0.038, 0.039, 0.04, 0.041, 0.042, 0.043, 0.044, 0.045, 0.046, 0.047, 0.048, 0.049, 0.05, 0.051, 0.052, 0.053, 0.054, 0.055, 0.056, 0.057, 0.058, 0.059]\n" +
            "    },\n" +
            "    {\n" +
            "      \"daysFrom8\": [0.035, 0.036, 0.037, 0.038, 0.039, 0.04, 0.041, 0.042, 0.043, 0.044, 0.045, 0.046, 0.047, 0.048, 0.049, 0.05, 0.051, 0.052, 0.053, 0.054, 0.055, 0.056, 0.057, 0.058, 0.059, 0.06, 0.061, 0.062, 0.063, 0.064]\n" +
            "    },\n" +
            "    {\n" +
            "      \"daysFrom9\": [0.04, 0.041, 0.042, 0.043, 0.044, 0.045, 0.046, 0.047, 0.048, 0.049, 0.05, 0.051, 0.052, 0.053, 0.054, 0.055, 0.056, 0.057, 0.058, 0.059, 0.06, 0.061, 0.062, 0.063, 0.064, 0.065, 0.066, 0.067, 0.068, 0.069]\n" +
            "    },\n" +
            "    {\n" +
            "      \"daysFrom10\": [0.045, 0.046, 0.047, 0.048, 0.049, 0.05, 0.051, 0.052, 0.053, 0.054, 0.055, 0.056, 0.057, 0.058, 0.059, 0.06, 0.061, 0.062, 0.063, 0.064, 0.065, 0.066, 0.067, 0.068, 0.069, 0.077, 0.064, 0.067, 0.066, 0.070]\n" +
            "    },\n" +
            "    {\n" +
            "      \"daysFrom11\": [0.049, 0.051, 0.051, 0.052, 0.053, 0.052, 0.051, 0.052, 0.050, 0.054, 0.056, 0.058, 0.057, 0.058, 0.059, 0.062, 0.063, 0.064, 0.063, 0.064, 0.065, 0.066, 0.067, 0.070, 0.069, 0.077, 0.069, 0.071, 0.072, 0.075]\n" +
            "    },\n" +
            "    {\n" +
            "      \"daysFrom12\": [0.052, 0.050, 0.049, 0.051, 0.052, 0.053, 0.051, 0.052, 0.055, 0.056, 0.058, 0.059, 0.059, 0.058, 0.060, 0.061, 0.062, 0.063, 0.064, 0.066, 0.068, 0.069, 0.070, 0.073, 0.075, 0.077, 0.077, 0.079, 0.080, 0.079]\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode rootNode = objectMapper.readTree(jsonString);

    public ImperativeZinsen() throws JsonProcessingException {
    }

    public void updatedValue(){

        try {
            JsonNode monthsNode = rootNode.get("months");

            if (monthsNode.isArray()) {
                List<List<Double>> modifiedRates = new ArrayList<>();
                List<Double> maxValues = new ArrayList<>();
                List<Double> minValues = new ArrayList<>();
                List<Double> differences = new ArrayList<>();

                for (int i = 0; i < monthsNode.size(); i++) {
                    JsonNode monthData = monthsNode.get(i);
                    List<Double> monthRates = new ArrayList<>();

                    for (int j = 1; j <= 31; j++) {
                        String dayKey = "daysFrom" + j;
                        JsonNode valuesNode = monthData.get(dayKey);

                        if (valuesNode != null && valuesNode.isArray()) {
                            for (JsonNode valueNode : valuesNode) {
                                double rate = valueNode.asDouble();

                                if (rate < 0.040) {
                                    rate *= 1.5;
                                } else {
                                    rate *= 1.2;
                                }

                                monthRates.add(rate);
                            }
                        }
                    }

                    if (!monthRates.isEmpty()) {
                        double max = Collections.max(monthRates);
                        double min = Collections.min(monthRates);
                        double diff = max - min;

                        modifiedRates.add(monthRates);
                        maxValues.add(max);
                        minValues.add(min);
                        differences.add(diff);
                    }
                }

                for (int i = 0; i < maxValues.size(); i++) {
                    System.out.println("Monat " + (i + 1) + ":");
                    System.out.println("Maximaler Wert: " + maxValues.get(i));
                    System.out.println("Minimaler Wert: " + minValues.get(i));
                    System.out.println("Differenz: " + differences.get(i));
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void averageMonth() {
        try {
            JsonNode monthsNode = rootNode.get("months");

            if (monthsNode.isArray()) {
                int numberOfMonths = monthsNode.size();

                for (int i = 0; i < numberOfMonths; i++) {
                    JsonNode daysNode = monthsNode.get(i);
                    String fieldName = "daysFrom" + (i + 1);

                    if (daysNode.has(fieldName) && daysNode.get(fieldName).isArray()) {
                        int numberOfDays = daysNode.get(fieldName).size();
                        double sum = 0.0;

                        for (int j = 0; j < numberOfDays; j++) {
                            sum += daysNode.get(fieldName).get(j).asDouble();
                        }

                        double average = sum / numberOfDays;
                        System.out.println("Durchschnitt für Monat " + (i + 1) + ": " + average);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
