import Block.Block;
import Blockchain.Blockchain;

import java.security.NoSuchAlgorithmException;
class My_Blockchain {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Blockchain b = new Blockchain();
        b.addBlock("1");
        b.addBlock("2");
        b.addBlock("3");
        b.addBlock("4");
        b.addBlock("5");
        b.addBlock("6");
        b.addBlock("7");

        for(Block blk : b.list ){
            System.out.println(blk.toString()+ "\n");
        }
    }
}
