package Exercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(">> Nhap vao phan tu thu " + (i + 1) + ": ");
            arrayList.add(scanner.nextInt());
        }

        System.out.println("----- -----");
        System.out.println("\nDanh sach cac phan tu co trong mang: ");
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.print(integer + "  ");
        }

        System.out.println("\n----- -----");
        System.out.println("Danh sach cac phan tu khong trung nhau: ");
        Set<Integer> set = new HashSet<>();
        set.addAll(arrayList);
        for(Integer i : set){
            System.out.print(i + "  ");
        }

        System.out.println("\n----- -----");
        System.out.println("So lan xuat hien cua cac phan tu co trong mang: ");
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arrayList.size(); i++){
            Integer key = arrayList.get(i);
            if(map.containsKey(key)){
                Integer val = map.get(key);
                val = val + 1;
                map.put(key, val);
            } else {
                map.put(key, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//        for(Map.Entry entry : entrySet){
//            System.out.println(">> Key: " + entry.getKey() + " | Value: " + entry.getValue());
//        }
        entrySet.stream().forEach(index -> {
            System.out.println(">> Key: " + index.getKey() + " | Value: " + index.getValue());
        });

        System.out.println("----- -----");
        System.out.println("Tra ve thong tin cua phan tu x nam trong mang");
        System.out.print("Nhap x: ");
        int x = scanner.nextInt();
        Iterator<Integer> iterator1 = arrayList.iterator();
        int count = 0;
        int exist = 0;
        while (iterator1.hasNext()){
            Integer integer = iterator1.next();
            if(integer == x){
                System.out.println(">> Index: " + count);
                exist++;
            }
            count++;
        }
        if(exist == 0){
            System.out.println("Khong ton tai phan tu " + x + " nam trong mang.");
        }

        System.out.println("----- -----");
        System.out.println("Dao nguoc cac phan tu trong mang su dung Collections: ");
        System.out.println(arrayList);
        System.out.println(">>");
        System.out.println("   <<");
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
