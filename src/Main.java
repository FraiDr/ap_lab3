import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws Exception {
        WorkWithFile w = new WorkWithFile();
        String[] arr = w.readFile();
        List<List<Integer>> workers = new ArrayList<>();
        for (int i = 0; i < parseInt(arr[0]); i++) {
                char[] beers = arr[i+2].toCharArray();
                List<Integer> workerBeers = new ArrayList<>();
                for (int k = 0; k < parseInt(arr[1]); k++) {
                    if (beers[k] == 'Y') {
                        workerBeers.add(k + 1);
                    }
                }
                workers.add(workerBeers);

        }
        WorkerTree workerTree = new WorkerTree();
        for (List<Integer> worker : workers) {
            workerTree.setWorker(worker);
        }
        for (List<WorkerTree.Node> worker : workerTree.workers) {
            System.out.println(worker);
        }

        System.out.println("The most reasonable quantity of beers is " + workerTree.findTheSmallestVarietyOfBeers());
        w.addFile(workerTree.findTheSmallestVarietyOfBeers());
    }

    public static List<List<Integer>> convertInputData() throws Exception {
        WorkWithFile w = new WorkWithFile();
        String[] arr = w.readFile();
        List<List<Integer>> workers = new ArrayList<>();
        for (int i = 0; i < parseInt(arr[0]); i++) {
            for (int l = 0; l + 2 < arr.length; l++) {
                char[] beers = arr[l + 2].toCharArray();
                List<Integer> workerBeers = new ArrayList<>();
                for (int k = 0; k < parseInt(arr[1]); k++) {
                    if (beers[k] == 'Y') {
                        workerBeers.add(k + 1);
                    }
                }
                workers.add(workerBeers);
            }
            }

            return workers;
        }

    }
