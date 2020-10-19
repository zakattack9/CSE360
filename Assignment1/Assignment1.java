import cse360assignment02.AddingMachine;

public class Assignment1 {
    public static void main(String[] args) {
        AddingMachine addingMachine = new AddingMachine();
        addingMachine.add(2);
        addingMachine.add(9);
        addingMachine.subtract(5);

        int currentTotal = addingMachine.getTotal();
        String history = addingMachine.toString();
        System.out.println(currentTotal);
        System.out.println(history);

        addingMachine.clear();

        currentTotal = addingMachine.getTotal();
        history = addingMachine.toString();
        System.out.println(currentTotal);
        System.out.println(history);
    }
}