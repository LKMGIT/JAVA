package August.day15.collection;

public class FindM {
    public static void main(String[] args) {
        DataSet d = new DataSet();
        int count = 0;

        for(String s : d.dataset){
            for(int i = 0; i < s.length(); i ++){
                if(s.charAt(i) == 'M'){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
