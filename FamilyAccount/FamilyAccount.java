class FamilyAccount{
    public static void main(String[] args){
    	//判断循环是否结束
        boolean isFlag = true;
        //初始金额
        int balance = 10000;
        
        // 用于记录用户的收入和支出的详情
        String details = "收支\t账户金额 \t收支金额\t说    明\n";
        while(isFlag){

            System.out.println("------------------------家庭收支记账---------------------------------\n");
            System.out.println("                        1 收支明细");
            System.out.println("                        2 登记收入");
            System.out.println("                        3 登记支出");
            System.out.println("                        4 退        出\n");
            System.out.print("                          请选择（1-4）:");
           
            //获取用户的选择
            char selection = Utility.readMenuSelection();

            switch (selection) {
                case '1':
                    //System.out.println("1.收支明细");
                	System.out.println("-------------当前收支明细记录------------------------");
                	
                	//收支明细
                	System.out.println(details);
                	
                	System.out.println("-----------------------------------------");
                    break;
                    
                case '2':
                	//收入金额
                    System.out.print("本次收入金额：");
                    int addmoney = Utility.readNumber();
                    //收入说明
                    System.out.print("本次收入说明：");
                    String addinfo = Utility.readString();
                    
                    //余额
                    balance += addmoney;
                    
                    //处理detail
                    
                    details += ("收入\t" + balance + "\t\t" + addmoney + "\t\t" + addinfo + "\n");
                    
                    System.out.println("---------------------登记完成---------------------\n\n\n");
                    
                    break;
                case '3':
                	//支出金额
                    System.out.print("本次支出金额：");
                    int minusmoney = Utility.readNumber();
                    //支出说明
                    System.out.print("本次支出说明：");
                    String minusinfo = Utility.readString();
                    
                    //余额
                    if(balance >= minusmoney) {
                    	balance -= minusmoney;
                    }
                    else {
                    	System.out.println("透支了，支付失败");
                    }
                    balance += minusmoney;
                    
                    //处理detail
                    
                    details += ("支出\t" + balance + "\t\t" + minusmoney + "\t\t" + minusinfo+ "\n");
                    
                    System.out.println("---------------------登记完成---------------------\n\n\n");
                    break;
                case '4':
                    //System.out.println("4.退    出");
                	System.out.print("确认是否退出（Y/N）");
                	char isExit = Utility.readConfirmSelection();
                	if(isExit == 'Y') {
                		isFlag = false;
                	}
                        break;   
            }

            
        }
    }
}