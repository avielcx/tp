package chching.record;

import java.util.ArrayList;

public class ExpenseList extends RecordList{

    protected ArrayList<Record> expenseList;
    public ExpenseList(ArrayList<Record> expenseList){
        this.expenseList = expenseList;
    }
    public ExpenseList(){
        expenseList = new ArrayList<>();

    }
    public int size() {
        return expenseList.size();
    }
    public void addExpense(Expense expense) {
        expenseList.add(expense);
    }
    public void editExpense(int i, String category, String description, String date, float value) {
        Expense exp = (Expense) expenseList.get(i - 1);
        if(!(category == null)) {
            exp.category = category;
        }
        if(!(description == null)) {
            exp.description = description;
        }
        if(!(date == null)) {
            exp.date = date;
        }
        if(!(value == 0)) {
            exp.value = value;
        }
    }
    public void printExpenseList() {
        for (int i = 1; i <= expenseList.size(); i++) {
            Record record = expenseList.get(i - 1);
            System.out.println(i + ". " + record.toString());
        }
    }
}