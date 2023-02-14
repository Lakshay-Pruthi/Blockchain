package Block;

public class Block {
    String data;
    public String Hash;
    public String Prev_Hash;
    public Block(String data, String Prev_Hash, String Hash){
        this.data = data;
        this.Prev_Hash = Prev_Hash;
        this.Hash = Hash;
    }

    public String toString(){
        return "Data : " + this.data +"\n" + "Hash : " + this.Hash + "\n" + "Previous Hash : " + this.Prev_Hash;
    }

}
