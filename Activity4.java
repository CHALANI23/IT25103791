public class Activity4 { 
    public static void main(String[] args) { 
        int row = 0; 
        int totalRows = 5; 
        int totalCols = 5; 
           System.out.println("Using while loop:"); 
        while (row < totalRows) { 
            int col = 0; 
             
            while (col < totalCols) { 
                System.out.print("* "); 
                col++; 
            } 
                        System.out.println(); 
            row++; 
        } 
    } 
}