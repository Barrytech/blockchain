/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class BlockchainApp {

	public static void main(String args[]) {
		
		Blockchain tcpCoin = new Blockchain();
		
		Block a = new Block("0x200", new java.util.Date(), "<transactions>");
		Block b = new Block("0x200", new java.util.Date(), "<transactions>");
		Block c = new Block("0x200", new java.util.Date(), "<transactions>");
		
		tcpCoin.addBlock(a);
		tcpCoin.addBlock(b);
		tcpCoin.addBlock(c);
		
		//tcpCoin.getLatestBlock().setPreviousHash("ABCDEFG");
		
		tcpCoin.displayChain();
		
		tcpCoin.isValid();

	}
	
   
}
