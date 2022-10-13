import java.io.*;

public class WorkWithFile {
    void addFile(int path) throws Exception {
        FileWriter writer = new FileWriter("result.txt");
        writer.write(Integer.toString(path));
        writer.flush();
    }


    String[] readFile() throws Exception {
        File file = new File("C:\\Users\\Home\\IdeaProjects\\ap_lab3\\ap_lab3\\src\\input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        String[] input = new String[52];

        int i = 0;
        while ((st = br.readLine()) != null) {
            if (st.contains(",")) {
                String[] arr = st.split(",");
                int workers, bears;
                workers= Integer.parseInt(arr[0]);
                bears = Integer.parseInt(arr[1]);
                input[i] = String.valueOf(workers);
                i++;
                input[i] = String.valueOf(bears);
                i++;



            } else if(st.contains(" ")) {
                String[] arr = st.split(" ");
                for(i=0; i<arr.length;i++)
                {
                    input[i+2] = arr[i];
                }

            }
        }

        return input;
    }
}