package lesson2OOP.HomeWork.Shop;

import lesson2OOP.HomeWork.customer.DatabaseUsers;
import lesson2OOP.HomeWork.customer.User;
import lesson2OOP.HomeWork.dataBase.BaseOfGoods;
import lesson2OOP.HomeWork.dataBase.GoodsChar;

import java.util.List;
import java.util.Scanner;

public class PrivateShop {

    public static void main(String[] args) {

        List<User> list = DatabaseUsers.getAllUsers();
        System.out.println(list.get(1));
        list.get(1).setOrder("Microfone");
        System.out.println(list.get(1));

        List<GoodsChar> goodsList = BaseOfGoods.goodsList();
        System.out.println(goodsList.get(1));

        String orderName = "TV";
        int id = 1;
        makeOrder(orderName, id);

        System.out.println(list.get(1));
        System.out.println(goodsList.get(1));


        System.out.println(showMyOrder());

    }

    private static void makeOrder(String nameGoods, int idCustomer) {
        List<GoodsChar> list = BaseOfGoods.goodsList();
        List<User> list1 = DatabaseUsers.getAllUsers();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (nameGoods.equals(list.get(j).getNameGoods()) && list.get(j).getValue() > 0) {
                    list1.get(idCustomer).setOrder(nameGoods);
                }
            }
        }
    }

    private static void changeCount() {

    }

    private static String showMyOrder() {
        Scanner scanner = new Scanner(System.in);
        List<GoodsChar> list1 = BaseOfGoods.goodsList();
        List<User> list2 = DatabaseUsers.getAllUsers();
        System.out.println("Enter Your NickName: ");
        String nick = scanner.nextLine();
        System.out.println("Enter your pass: ");
        String pass = scanner.nextLine();
        for (int i = 0; i<list2.size(); i++) {
            if (nick.equals(list2.get(i).getNickName()) & pass.equals(list2.get(i).getPassword())) {
                return String.valueOf(list1.get(i));
            }
        }
        return null;
    }
}
