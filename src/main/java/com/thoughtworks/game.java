package com.thoughtworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Card implements Comparable<Card>{
	int num;
	char color;
	public Card(int num, char color) {
		if(num == 36)
			this.num = 10;
		else if(num == 26)
			this.num = 11;
		else if(num == 33)
			this.num = 12;
		else if(num == 27)
			this.num = 13;
		else if(num == 17)
			this.num = 14;
		else
			this.num = num;
		this.color = color;
	}
	
	@Override
	public int compareTo(Card o) {
		return this.num - o.num;
	}
}

public class game {
	
	public static boolean isTonghuashun(List<Card> cards) {
		if((cards.get(0).color == cards.get(1).color) && 
		   (cards.get(0).color == cards.get(2).color) && 
		   (cards.get(0).color == cards.get(3).color) && 
		   (cards.get(0).color == cards.get(4).color) &&
		   (cards.get(0).num == cards.get(1).num-1) &&
		   (cards.get(0).num == cards.get(2).num-2) &&
		   (cards.get(0).num == cards.get(3).num-3) &&
		   (cards.get(0).num == cards.get(4).num-4))
			return true;
		return false;
	}
	
	public static boolean isTiezhi(List<Card> cards) {
		if((cards.get(0).num == cards.get(3).num) || (cards.get(1).num == cards.get(4).num))
			return true;
		return false;
	}
	
	public static boolean isHulu(List<Card> cards) {
		if(((cards.get(0).num == cards.get(2).num) && 
		    (cards.get(3).num == cards.get(4).num)) || 
		   ((cards.get(0).num == cards.get(1).num) && 
		    (cards.get(2).num == cards.get(4).num)))
			return true;
		return false;
	}
	
	public static boolean isTonghua(List<Card> cards) {
		if((cards.get(0).color == cards.get(1).color) && 
		   (cards.get(0).color == cards.get(2).color) && 
		   (cards.get(0).color == cards.get(3).color) && 
		   (cards.get(0).color == cards.get(4).color))
			return true;
		return false;
	}
	
	public static boolean isShunzi(List<Card> cards) {
		if((cards.get(0).num == cards.get(1).num-1) &&
		   (cards.get(0).num == cards.get(2).num-2) &&
		   (cards.get(0).num == cards.get(3).num-3) &&
		   (cards.get(0).num == cards.get(4).num-4))
			return true;
		return false;
	}
	
	public static boolean isSantiao(List<Card> cards) {
		if(cards.get(0).num == cards.get(2).num || 
		   cards.get(1).num == cards.get(3).num || 
		   cards.get(2).num == cards.get(4).num)
			return true;
		return false;
	}
	
	public static boolean isLiangdui(List<Card> cards) {
		if((cards.get(0).num == cards.get(1).num && cards.get(2).num == cards.get(3).num) || 
		   (cards.get(0).num == cards.get(1).num && cards.get(3).num == cards.get(4).num) || 
		   (cards.get(1).num == cards.get(2).num && cards.get(3).num == cards.get(4).num))
			return true;
		return false;
	}
	
	public static boolean isDuizi(List<Card> cards) {
		if((cards.get(0).num == cards.get(1).num) || 
		   (cards.get(1).num == cards.get(2).num) || 
		   (cards.get(2).num == cards.get(3).num) ||
		   (cards.get(3).num == cards.get(4).num))
			return true;
		return false;
	}
	
	public static int cardType(List<Card> cards) {
		if(isTonghuashun(cards))
			return 9;
		else if(isTiezhi(cards))
			return 8;
		else if(isHulu(cards))
			return 7;
		else if(isTonghua(cards))
			return 6;
		else if(isShunzi(cards))
			return 5;
		else if(isSantiao(cards))
			return 4;
		else if(isLiangdui(cards))
			return 3;
		else if(isDuizi(cards))
			return 2;
		return 1;
	}
	
	public static void print(int type) {
		if(type == 2)
			System.out.println("对子");
		else if(type == 3)
			System.out.println("两对");
		else if(type == 4)
			System.out.println("三条");
		else if(type == 5)
			System.out.println("顺子");
		else if(type == 6)
			System.out.println("同花");
		else if(type == 7)
			System.out.println("葫芦");
		else if(type == 8)
			System.out.println("铁支");
		else if(type == 9)
			System.out.println("同花顺");
	}
	
	public static void print1(int num) {
		if(num >= 2 && num <= 9)
			System.out.println(num);
		else if(num == 10)
			System.out.println('T');
		else if(num == 11)
			System.out.println('J');
		else if(num == 12)
			System.out.println('Q');
		else if(num == 13)
			System.out.println('K');
		else if(num == 14)
			System.out.println("Ace");
	}
	
	public void main(String str1) {
		List<Card> black = new ArrayList<Card>();
		List<Card> white = new ArrayList<Card>();

        Card card1 = new Card(str1.charAt( 7)-'0', str1.charAt(8));
        Card card2 = new Card(str1.charAt(10)-'0', str1.charAt(11));
        Card card3 = new Card(str1.charAt(13)-'0', str1.charAt(14));
        Card card4 = new Card(str1.charAt(16)-'0', str1.charAt(17));
        Card card5 = new Card(str1.charAt(19)-'0', str1.charAt(20));
        Card card6 = new Card(str1.charAt(29)-'0', str1.charAt(30));
        Card card7 = new Card(str1.charAt(32)-'0', str1.charAt(33));
        Card card8 = new Card(str1.charAt(35)-'0', str1.charAt(36));
        Card card9 = new Card(str1.charAt(38)-'0', str1.charAt(39));
        Card card0 = new Card(str1.charAt(41)-'0', str1.charAt(42));
        black.add(card1);black.add(card2);black.add(card3);black.add(card4);black.add(card5);
        white.add(card6);white.add(card7);white.add(card8);white.add(card9);white.add(card0);
    
        Collections.sort(black);
        Collections.sort(white);
        int blackType = cardType(black);
        int whiteType = cardType(white);
        if(blackType > whiteType) {
        	System.out.print("Black wins - ");
        	print(blackType);
        }
        else if(blackType < whiteType) {
        	System.out.println("White wins - ");
        	print(whiteType);
        }
        else {
        	if(blackType == 1) {
        		if(black.get(4).num > white.get(4).num) {
        			System.out.print("Black wins - high card: ");
        			print1(black.get(4).num);
        		}
        		else if(black.get(4).num < white.get(4).num) {
        			System.out.print("White wins - high card: ");
        			print1(white.get(4).num);
        		}
        		else {
        			if(black.get(3).num > white.get(3).num) {
        				System.out.print("Black wins - high card: ");
            			print1(black.get(3).num);
            		}
            		else if(black.get(3).num < white.get(3).num) {
            			System.out.print("White wins - high card: ");
            			print1(white.get(3).num);
            		}
            		else {
            			if(black.get(2).num > white.get(2).num) {
            				System.out.print("Black wins - high card: ");
                			print1(black.get(2).num);
                		}
                		else if(black.get(2).num < white.get(2).num) {
                			System.out.print("White wins - high card: ");
                			print1(white.get(2).num);
                		}
                		else {
                			if(black.get(1).num > white.get(1).num) {
                				System.out.print("Black wins - high card: ");
                    			print1(black.get(1).num);
                    		}
                    		else if(black.get(1).num < white.get(1).num) {
                    			System.out.print("White wins - high card: ");
                    			print1(white.get(1).num);
                    		}
                    		else {
                    			if(black.get(0).num > white.get(0).num) {
                    				System.out.print("Black wins - high card: ");
                        			print1(black.get(0).num);
                        		}
                        		else if(black.get(0).num < white.get(0).num) {
                        			System.out.print("White wins - high card: ");
                        			print1(white.get(0).num);
                        		}
                        		else {
                        			System.out.println("Tie");
                        		}
                    		}
                		}
            		}
        		}
        	}
        	else if(blackType == 2) {
        		int b1, b2, b3, b4;
        		int w1, w2, w3, w4;
        		if(black.get(0).num == black.get(1).num) {
        			b1 = black.get(0).num;
        			b2 = black.get(4).num;
        			b3 = black.get(3).num;
        			b4 = black.get(2).num;
        		}
        		else if(black.get(1).num == black.get(2).num) {
        			b1 = black.get(1).num;
        			b2 = black.get(4).num;
        			b3 = black.get(3).num;
        			b4 = black.get(0).num;
        		}
				else if(black.get(2).num == black.get(3).num) {
					b1 = black.get(2).num;
        			b2 = black.get(4).num;
        			b3 = black.get(1).num;
        			b4 = black.get(0).num; 			
				}
				else {
					b1 = black.get(4).num;
        			b2 = black.get(2).num;
        			b3 = black.get(1).num;
        			b4 = black.get(0).num;
				}
        		if(white.get(0).num == white.get(1).num) {
        			w1 = white.get(0).num;
        			w2 = white.get(4).num;
        			w3 = white.get(3).num;
        			w4 = white.get(2).num;
        		}
        		else if(white.get(1).num == white.get(2).num) {
        			w1 = white.get(0).num;
        			w2 = white.get(4).num;
        			w3 = white.get(3).num;
        			w4 = white.get(2).num;
        		}
				else if(white.get(2).num == white.get(3).num) {
					w1 = white.get(0).num;
        			w2 = white.get(4).num;
        			w3 = white.get(3).num;
        			w4 = white.get(2).num;		
				}
				else {
					w1 = white.get(0).num;
        			w2 = white.get(4).num;
        			w3 = white.get(3).num;
        			w4 = white.get(2).num;
				}
        		if(b1 > w1) {
        			System.out.print("Black wins - ");
		        	print(2);
        		}
        		else if(b1 < w1) {
        			System.out.print("White wins - ");
		        	print(2);
        		}
        		else {
        			if(b2 > w2) {
        				System.out.print("Black wins - ");
    		        	print(2);
            		}
            		else if(b2 < w2) {
            			System.out.print("White wins - ");
    		        	print(2);
            		}
            		else {
            			if(b3 > w3) {
            				System.out.print("Black wins - ");
        		        	print(2);
                		}
                		else if(b3 < w3) {
                			System.out.print("White wins - ");
        		        	print(2);
                		}
                		else {
                			if(b4 > w4) {
                				System.out.print("Black wins - ");
            		        	print(2);
                    		}
                    		else if(b4 < w4) {
                    			System.out.print("White wins - ");
            		        	print(2);
                    		}
                    		else {
                    			System.out.println("Tie");
                    		}
                		}
            		}
        		}
        	}
			else if(blackType == 3) {
				int black1, black2, black3;
				int white1, white2, white3;
				if(black.get(0).num == black.get(1).num && black.get(2).num == black.get(3).num) {
					black1 = black.get(2).num;
					black2 = black.get(0).num;
					black3 = black.get(4).num;
				}
				else if(black.get(0).num == black.get(1).num && black.get(3).num == black.get(4).num) {
					black1 = black.get(3).num;
					black2 = black.get(0).num;
					black3 = black.get(2).num;
				}
				else {
					black1 = black.get(3).num;
					black2 = black.get(1).num;
					black3 = black.get(0).num;
				}
				if(white.get(0).num == white.get(1).num && white.get(2).num == white.get(3).num) {
					white1 = white.get(2).num;
					white2 = white.get(0).num;
					white3 = white.get(4).num;
				}
				else if(white.get(0).num == white.get(1).num && white.get(3).num == white.get(4).num) {
					white1 = white.get(3).num;
					white2 = white.get(0).num;
					white3 = white.get(2).num;
				}
				else {
					white1 = white.get(3).num;
					white2 = white.get(1).num;
					white3 = white.get(0).num;
				}
				if(black1 > white1) {
					System.out.print("Black wins - ");
		        	print(3);
				}
				else if(black1 < white1) {
					System.out.print("White wins - ");
		        	print(3);
				}
				else {
					if(black2 > white2) {
						System.out.print("Black wins - ");
			        	print(3);
					}
					else if(black2 < white2) {
						System.out.print("White wins - ");
			        	print(3);
					}
					else {
						if(black3 > white3) {
							System.out.print("Black wins - ");
				        	print(3);
						}
						else if(black3 < white3) {
							System.out.print("White wins - ");
				        	print(3);
						}
						else {
							System.out.println("Tie");
						}
					}
				}
			}
			else if(blackType == 4) {
				int blacknum, whitenum;
				if(black.get(0).num == black.get(2).num)
					blacknum = black.get(0).num;
				else if(black.get(1).num == black.get(3).num)
					blacknum = black.get(3).num;
				else
					blacknum = black.get(4).num;
				if(white.get(0).num == white.get(2).num)
					whitenum = white.get(0).num;
				else if(white.get(1).num == white.get(3).num)
					whitenum = white.get(3).num;
				else
					whitenum = white.get(4).num;
				if(blacknum == whitenum)
					System.out.println("Tie");
				else if(blacknum > whitenum) {
					System.out.print("Black wins - ");
		        	print(4);
				}
				else {
					System.out.print("White wins - ");
		        	print(4);
				}
			}
			else if(blackType == 5) {
				if(black.get(4).num == white.get(4).num)
					System.out.println("Tie");
				else if(black.get(4).num > white.get(4).num) {
					System.out.print("Black wins - ");
		        	print(5);
				}
				else {
					System.out.print("White wins - ");
		        	print(5);
				}
			}
			else if(blackType == 6) {
        		if(black.get(4).num > white.get(4).num) {
        			System.out.print("Black wins - ");
        			print(6);
        		}
        		else if(black.get(4).num < white.get(4).num) {
        			System.out.print("White wins - ");
        			print(6);
        		}
        		else {
        			if(black.get(3).num > white.get(3).num) {
        				System.out.print("Black wins - ");
            			print(6);
            		}
            		else if(black.get(3).num < white.get(3).num) {
            			System.out.print("White wins - ");
            			print(6);
            		}
            		else {
            			if(black.get(2).num > white.get(2).num) {
            				System.out.print("Black wins - ");
                			print(6);
                		}
                		else if(black.get(2).num < white.get(2).num) {
                			System.out.print("White wins ");
                			print(6);
                		}
                		else {
                			if(black.get(1).num > white.get(1).num) {
                				System.out.print("Black wins ");
                    			print(6);
                    		}
                    		else if(black.get(1).num < white.get(1).num) {
                    			System.out.print("White wins ");
                    			print(6);
                    		}
                    		else {
                    			if(black.get(0).num > white.get(0).num) {
                    				System.out.print("Black wins ");
                        			print(6);
                        		}
                        		else if(black.get(0).num < white.get(0).num) {
                        			System.out.print("White wins ");
                        			print(6);
                        		}
                        		else {
                        			System.out.println("Tie");
                        		}
                    		}
                		}
            		}
        		}
			}
			else if(blackType == 7) {
				int blacknum, whitenum;
				if(black.get(0).num == black.get(2).num)
					blacknum = black.get(0).num;
				else
					blacknum = black.get(4).num;
				if(white.get(0).num == white.get(2).num)
					whitenum = white.get(0).num;
				else
					whitenum = white.get(4).num;
				if(blacknum == whitenum)
					System.out.println("Tie");
				else if(blacknum > whitenum) {
					System.out.print("Black wins - ");
		        	print(7);
				}
				else {
					System.out.print("White wins - ");
		        	print(7);
				}
			}
			else if(blackType == 8) {
				int blacknum, whitenum;
				if(black.get(0).num == black.get(3).num)
					blacknum = black.get(0).num;
				else
					blacknum = black.get(4).num;
				if(white.get(0).num == white.get(3).num)
					whitenum = white.get(0).num;
				else
					whitenum = white.get(4).num;
				if(blacknum == whitenum)
					System.out.println("Tie");
				else if(blacknum > whitenum) {
					System.out.print("Black wins - ");
		        	print(8);
				}
				else {
					System.out.print("White wins - ");
		        	print(8);
				}
			}
			else if(blackType == 9) {
				if(black.get(4).num == white.get(4).num)
					System.out.println("Tie");
				else if(black.get(4).num > white.get(4).num) {
					System.out.print("Black wins - ");
		        	print(9);
				}
				else {
					System.out.print("White wins - ");
		        	print(9);
				}
			}
        }
	}
}