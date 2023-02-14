package Blockchain;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import Block.Block;

public class Blockchain {
    public ArrayList<Block> list;
    int index = 0;
    public Blockchain() throws NoSuchAlgorithmException {
        String firstHash = giveHashCode("First-Block");
        String firstPrevHash = giveHashCode("First-Block-prevHash");
        Block block = new Block("first-Block",firstHash,firstPrevHash);
        list = new ArrayList<>();
        list.add(block);
        index++;
    }
    public String giveHashCode(String input) throws NoSuchAlgorithmException {
        MessageDigest mgd = MessageDigest.getInstance("SHA-256");
        byte[] messageDigest = mgd.digest(input.getBytes());
        BigInteger bigInt = new BigInteger(1,messageDigest);
        return bigInt.toString(16);
    }
    public void addBlock(String data) throws NoSuchAlgorithmException {
        Block prevBlock = list.get(index-1);
        String prevHash = prevBlock.Hash;
        String Hash = giveHashCode(data+ prevBlock.Hash);
        Block block = new Block(data,prevHash,Hash);
        list.add(block);
        index++;
    }
}


