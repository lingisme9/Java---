class FamilyAccount{
    public static void main(String[] args){
    	//�ж�ѭ���Ƿ����
        boolean isFlag = true;
        //��ʼ���
        int balance = 10000;
        
        // ���ڼ�¼�û��������֧��������
        String details = "��֧\t�˻���� \t��֧���\t˵    ��\n";
        while(isFlag){

            System.out.println("------------------------��ͥ��֧����---------------------------------\n");
            System.out.println("                        1 ��֧��ϸ");
            System.out.println("                        2 �Ǽ�����");
            System.out.println("                        3 �Ǽ�֧��");
            System.out.println("                        4 ��        ��\n");
            System.out.print("                          ��ѡ��1-4��:");
           
            //��ȡ�û���ѡ��
            char selection = Utility.readMenuSelection();

            switch (selection) {
                case '1':
                    //System.out.println("1.��֧��ϸ");
                	System.out.println("-------------��ǰ��֧��ϸ��¼------------------------");
                	
                	//��֧��ϸ
                	System.out.println(details);
                	
                	System.out.println("-----------------------------------------");
                    break;
                    
                case '2':
                	//������
                    System.out.print("���������");
                    int addmoney = Utility.readNumber();
                    //����˵��
                    System.out.print("��������˵����");
                    String addinfo = Utility.readString();
                    
                    //���
                    balance += addmoney;
                    
                    //����detail
                    
                    details += ("����\t" + balance + "\t\t" + addmoney + "\t\t" + addinfo + "\n");
                    
                    System.out.println("---------------------�Ǽ����---------------------\n\n\n");
                    
                    break;
                case '3':
                	//֧�����
                    System.out.print("����֧����");
                    int minusmoney = Utility.readNumber();
                    //֧��˵��
                    System.out.print("����֧��˵����");
                    String minusinfo = Utility.readString();
                    
                    //���
                    if(balance >= minusmoney) {
                    	balance -= minusmoney;
                    }
                    else {
                    	System.out.println("͸֧�ˣ�֧��ʧ��");
                    }
                    balance += minusmoney;
                    
                    //����detail
                    
                    details += ("֧��\t" + balance + "\t\t" + minusmoney + "\t\t" + minusinfo+ "\n");
                    
                    System.out.println("---------------------�Ǽ����---------------------\n\n\n");
                    break;
                case '4':
                    //System.out.println("4.��    ��");
                	System.out.print("ȷ���Ƿ��˳���Y/N��");
                	char isExit = Utility.readConfirmSelection();
                	if(isExit == 'Y') {
                		isFlag = false;
                	}
                        break;   
            }

            
        }
    }
}