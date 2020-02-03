package projectException;

public class Main {
    public static void main(String[] args) {
        String[][] strings = {
                {"123", "754", "235", "9803"},
                {"936", "943", "34", "4675"},
                {"24567", "9342", "8084", "43"},
                {"48", "4678", "45678", "239"},
        };
        try {
            System.out.println(arraySum(strings));
        } catch (MySizeArrayException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (MyArrayDataException e){
            System.out.println(e.getMessage() + " .Некорректные данные в ячейке i =" + e.getI() + " , j =" + e.getJ());
            e.printStackTrace();
        }

    }


    public static int arraySum(String[][] arrays) throws MySizeArrayException, MyArrayDataException {
        int answer = 0;
        if (arrays.length != 4 ) {
            throw new MySizeArrayException("Размерность строк не равна 4");
        }

        for (int i = 0; i < arrays.length; i++) {
             if (arrays[i].length != 4){
                    throw new MySizeArrayException("Размерность столбцов не равна 4");
                }
        }

        int conversion;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                try{
                    conversion = Integer. parseInt(arrays[i][j]);

                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Не корректный формат",i,j);
                }
                answer+=conversion;
               }
        }
        return answer;
    }
}
