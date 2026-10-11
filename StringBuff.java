class Demo{
    private int name;
    private int age;
    public int getName() {
        return name;
    }
    public void setName(int name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
public class StringBuff {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("harsh");
        sb.append(" garg");
        String s = sb.toString();

        System.out.println(sb);
        System.out.println(s);
        sb.deleteCharAt(2);
        System.out.println(sb);
    
    }
}
