// package codevita;

// import java.util.*;

// public class _2CircuitSimulation {

//     public static void main(String[] args) {
//         Scanner inputScanner = new Scanner(System.in);
//         int gateCount = Integer.parseInt(inputScanner.nextLine());
//         Map<String, String[]> gateDefinitions = new HashMap<>();
//         for (int i = 0; i < gateCount; i++) {
//             String[] gateData = inputScanner.nextLine().split("=");
//             String gateName = gateData[0].trim();
//             String[] gateArgs = gateData[1].trim().split("[(), ]+");
//             gateDefinitions.put(gateName, gateArgs);
//         }
//         int cycles = Integer.parseInt(inputScanner.nextLine());
//         Map<String, int[]> inputValues = new HashMap<>();
//         while (true) {
//             String line = inputScanner.nextLine();
//             if (line.matches("[a-zA-Z]+")) {
//                 String finalGate = line.trim();
//                 processCircuit(gateDefinitions, inputValues, finalGate, cycles);
//                 break;
//             }
//             String[] data = line.split(" ");
//             String varName = data[0];
//             int[] timings = Arrays.stream(data, 1, data.length)
//                                   .mapToInt(Integer::parseInt)
//                                   .toArray();
//             inputValues.put(varName, timings);
//         }
        
//         inputScanner.close();
//     }

//     private static void processCircuit(Map<String, String[]> gateDefinitions, Map<String, int[]> inputValues, String finalGate, int cycles) {
//         Map<String, int[]> gateOutputs = new HashMap<>();
//         for (String gate : gateDefinitions.keySet()) {
//             gateOutputs.put(gate, new int[cycles]);
//         }
//         for (int cycle = 1; cycle < cycles; cycle++) {
//             for (String gate : gateDefinitions.keySet()) {
//                 String[] gateInfo = gateDefinitions.get(gate);
//                 String operation = gateInfo[0];
//                 String input1 = gateInfo[1];
//                 String input2 = gateInfo[2];
//                 int val1 = getVariableValue(input1, gateOutputs, inputValues, cycle - 1);
//                 int val2 = getVariableValue(input2, gateOutputs, inputValues, cycle - 1);
//                 int output = evaluateGateOperation(operation, val1, val2);
//                 gateOutputs.get(gate)[cycle] = output;
//             }
//         }
//         int[] finalOutput = gateOutputs.get(finalGate);
//         for (int i = 0; i < cycles; i++) {
//             System.out.print(finalOutput[i] + (i == cycles - 1 ? "\n" : " "));
//         }
//     }

//     private static int getVariableValue(String var, Map<String, int[]> gateOutputs, Map<String, int[]> inputValues, int cycle) {
//         if (inputValues.containsKey(var)) {
//             return inputValues.get(var)[cycle];
//         } else {
//             return gateOutputs.get(var)[cycle];
//         }
//     }

//     private static int evaluateGateOperation(String operation, int val1, int val2) {
//         int result = 0;
//         switch (operation) {
//             case "AND":
//                 result = val1 & val2;
//                 break;
//             case "OR":
//                 result = val1 | val2;
//                 break;
//             case "NAND":
//                 result = ~(val1 & val2) & 1;
//                 break;
//             case "NOR":
//                 result = ~(val1 | val2) & 1;
//                 break;
//             case "XOR":
//                 result = val1 ^ val2;
//                 break;
//         }
//         return result;
//     }
// }

