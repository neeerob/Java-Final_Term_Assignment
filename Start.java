import java.lang.*;
import java.util.Scanner;


import classes.*;
import fileio.*;

public class Start 
{


    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        FileReadWriteDemo fileReadWrite = new FileReadWriteDemo();
        int choice;

        Market market = new Market();
        Shop shop = new Shop();
        System.out.println("-----------------------------------");
        System.out.println("||    Welcome To Neee Market     ||");
        System.out.println("-----------------------------------\n");


        do
        {
            System.out.println("******       Main Menu      *****\n");
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println("\t1. Employee Management");
            System.out.println("\t2. Shop Management");
            System.out.println("\t3. Shop Product Management");
            System.out.println("\t4. Product Quentity add-sell");
            System.out.println("\t5. Exit");
            System.out.println("-----------------------------------\n");
            System.out.print("Enter Your Choice: ");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1: //Emp management

                    System.out.println("-----------------------------------");
                    System.out.println("You Choose Employee management option");
                    System.out.println("-----------------------------------\n");
                    
                    while(choice != 5)
                    {
                        System.out.println("What do you want to do?");
                        System.out.println("\t1. Insert new Employee");
                        System.out.println("\t2. Remove Existing Employee");
                        System.out.println("\t3. Show All Employees");
                        System.out.println("\t4. Search an Employee");
                        System.out.println("\t5. Go Back to Main Menu");
                        System.out.println("-----------------------------------\n");
                        System.out.println();

                        System.out.print("Enter Your Choice: ");
                        choice = scan.nextInt();

                            switch(choice)
                            {
                                case 1: //insert Employee
                                    System.out.println("-----------------------------------");
                                    System.out.println("  You Choose Insert new employee  ");
                                    System.out.println("-----------------------------------\n");

                                    System.out.print("Enter Employee ID: ");
                                    String empId1 = scan.next();
                                    
							        System.out.print("Enter Employee Name: ");
                                    String empName1 = scan.next();
                                    
							        System.out.print("Enter Employe Salary: ");
							        double salary1 = scan.nextDouble();
							
							        Employee employee1 = new Employee();
							        employee1.setEmpId(empId1);
							        employee1.setName(empName1);
                                    employee1.setSalary(salary1);
                                    if(market.insertEmployee(employee1))
                                    {
                                        System.out.println("Inserting ...");
                                        System.out.println("Successful!! Employee inserted with ID :" + employee1.getEmpId());
                                        
                                    }
                                    else
                                    {
                                        System.out.println("Unsuccessful ...");
                                        System.out.println("Employee can't inserted!!");
                                        
                                    }
                                    System.out.println("-----------------------------------");
                                break;

                                case 2: //remove employee
                                    System.out.println("-----------------------------------");
                                    System.out.println("  You Choose Remove Existing Employee ");
                                    System.out.println("-----------------------------------\n");

                                    System.out.print("Enter an Employee ID to Remove: ");
							        String empId2 = scan.next();
							
							        Employee employee2 = market.searchEmployee(empId2);
							
							        if(employee2 != null)
							        {
                                        if(market.removeEmployee(employee2))
                                        {
                                            System.out.println("Successful!!");
                                            System.out.println("Employee Removed with ID: "+employee2.getEmpId());
                                        }
                                        else
                                        {
                                            System.out.println("Unsuccessful!!");
                                            System.out.println("Employee Can Not be Removed......");
                                        }
							        }
							        else
							        {
								        System.out.println("Employee Does Not Exist");
                                    }
                                    System.out.println("-----------------------------------");
                            
                                break;

                                case 3: //show all employee
                                    System.out.println("-----------------------------------");
                                    System.out.println("  You Choose Show All Employees ");
                                    System.out.println("-----------------------------------\n");
                                    market.showAllEmployees();
                                break;

                                case 4:  //search
                                    System.out.println("-----------------------------------");
                                    System.out.println("  You Choose Search an Employee ");
                                    System.out.println("-----------------------------------\n");
                                    System.out.print("Enter an Employee ID to Search: ");
							        String empId3 = scan.next();
							
							        Employee e3 = market.searchEmployee(empId3);
							
							        if(e3 != null)
							        {
								        System.out.println("   !!!   Employee Found    !!!");
								        System.out.println("Employee ID     : "+e3.getEmpId());
								        System.out.println("Employee Name   : "+e3.getName());
								        System.out.println("Employee Salary : "+e3.getSalary()+" $");
							        }
							        else
							        {
								        System.out.println("Employee Does Not Exist");
							        }
                                    
                                    System.out.println("-----------------------------------");
                                break;

                                case 5:  //back
                                    System.out.println("Going back ....");
                                    System.out.println();


                                break;

                                default:
                                    System.out.println("You Press Wrong keyword !!");

                                break;

                            }
                    }
                    choice = 7;
                    
                break;

                case 2: //Shop management
                    System.out.println("-----------------------------------");
                    System.out.println("You Choose Shop management option");
                    System.out.println("-----------------------------------\n");
                    while(choice != 5)
                    {
                        System.out.println("What do you want to do?");
                        System.out.println("\t1. Insert New Shop");
                        System.out.println("\t2. Remove Existing Shop");
                        System.out.println("\t3. Show All Shops");
                        System.out.println("\t4. Search a Shop");
                        System.out.println("\t5. Go Back to Main Menu");
                        System.out.println("-----------------------------------\n");
                        System.out.println();
                        System.out.print("Enter Your Choice: ");
                        choice = scan.nextInt();

                        switch(choice)
                        {
                            case 1:

                                System.out.println("-----------------------------------");
                                System.out.println("  You Choose Insert New Shop ");
                                System.out.println("-----------------------------------\n");

                                System.out.print("Enter Shop Name: ");
							    String shopName1 = scan.next();
							    System.out.print("Enter Shop NID: ");
                                String shopNid = scan.next();
                                
                                //Shop shop = new Shop();
                                shop.setName(shopName1);
                                shop.setSid(shopNid);
                                
                                if(market.insertShop(shop))
                                {
                                    System.out.println("Inserting ...");
                                    System.out.println("Successful!! Shop inserted with ID :" + shop.getSid());
                                }
                                else
                                {
                                    System.out.println("Unsuccessful ...");
                                    System.out.println("Shop can't inserted!!");
                                }
                                System.out.println("-----------------------------------");

                             break;

                            case 2:

                                    System.out.println("-----------------------------------");
                                    System.out.println("  You Choose Remove Existing Shop ");
                                    System.out.println("-----------------------------------\n");

                                    System.out.print("Enter an Shop ID to Search: ");
							        String shopNid2 = scan.next();
							
                                    Shop shop2 = market.searchShop(shopNid2);
                                    if(shop2 != null)
							        {
                                        if(market.removeShop(shop2))
                                        {
                                            System.out.println("Successful!!");
                                            System.out.println("Shop Removed with ID: "+shop2.getSid());
                                        }
                                        else
                                        {
                                            System.out.println("Unsuccessful!!");
                                            System.out.println("Shop Can Not be Removed......");
                                        }
							        }
							        else
							        {
								        System.out.println("Shop Does Not Exist");
                                    }
                                    System.out.println("-----------------------------------");
                                    
                             break;

                            case 3:

                                    System.out.println("-----------------------------------");
                                    System.out.println("  You Choose Show All Shops ");
                                    System.out.println("-----------------------------------\n");
                                    market.showAllShops();

                             break;

                            case 4:

                                    System.out.println("-----------------------------------");
                                    System.out.println("  You Choose Search a Shop ");
                                    System.out.println("-----------------------------------\n");

                                    System.out.print("Enter an Shop ID to Search: ");
							        String shopNid4 = scan.next();
							
							        Shop shop4 = market.searchShop(shopNid4);
							
							        if(shop4 != null)
							        {
								        System.out.println("  !!!  Shop Found   !!!");
								        System.out.println("Shop NID   : "+shop4.getName());
								        System.out.println("Shop Name  : "+shop4.getSid());
								        shop4.showAllProducts();
							        }
							        else
							        {
								        System.out.println("Shop Does Not Exist");
                                    }
                                    System.out.println("-----------------------------------");

                             break;

                            case 5:
                                    System.out.println("Going back ....");
                                    System.out.println();
                             break;

                            default:

                                    System.out.println("You Press Wrong keyword !!");

                             break;
                        }

                    }
                    
                    choice = 7;

                break;

                case 3: // Product management
                    System.out.println("-----------------------------------");
                    System.out.println("You Choose Product management option");
                    System.out.println("-----------------------------------\n");
                    while(choice != 5)
                    {
                        System.out.println("What do you want to do?");
                        System.out.println("\t1. Insert New Product");
                        System.out.println("\t2. Remove Existing Product");
                        System.out.println("\t3. Show All Products");
                        System.out.println("\t4. Search a Product");
                        System.out.println("\t5. Go Back to Main Menu");
                        System.out.println("-----------------------------------\n");
                        System.out.println();
                        System.out.print("Enter Your Choice: ");
                        choice = scan.nextInt();

                        switch (choice)
                        {
                            case 1:

                                System.out.println("-----------------------------------");
                                System.out.println("You Choose Insert New Product for a Shop ");
                                System.out.println("-----------------------------------\n");

                                System.out.print("Enter Shop ID: ");
                                String sid1 = scan.next();
                                
                                if(market.searchShop(sid1) != null)
                                {
                                    System.out.println("\tChoose your Product Type \n");
								    System.out.println("\t1. Local Product");
								    System.out.println("\t2. Imported Product");
                                    System.out.println("\t3. Go Back....");

                                    choice = scan.nextInt();

                                    switch(choice)
                                    {
                                        case 1:

                                            System.out.println("You choose Local Product !");
                                            System.out.println("            --            ");
                                            System.out.print("Enter Product ID : ");
                                            String pID1 = scan.next();

                                            System.out.print("Enter Product Name : ");
                                            String pName1 = scan.next();

                                            System.out.print("Enter Product Available Quantity : ");
                                            int pAvailableQuantity1 = scan.nextInt();

                                            System.out.print("Enter Product Price : ");
                                            double pPrice1 = scan.nextDouble();

                                            System.out.print("Enter Product Discount Rate : ");
                                            double pDiscountRate1 = scan.nextDouble();

                                            LocalProduct localProduct = new LocalProduct();

                                            localProduct.setPid(pID1);
                                            localProduct.setName(pName1);
                                            localProduct.setAvailableQuantity(pAvailableQuantity1);
                                            localProduct.setPrice(pPrice1);
                                            localProduct.setDiscountRate(pDiscountRate1);

                                            if(market.searchShop(sid1).insertProduct(localProduct))
                                            {
                                                System.out.println("Product Inserted For Shop ID : " + sid1);
                                            }
                                            else 
                                            {
                                                System.out.println("Unsuccessful ...");
                                                System.out.println("Product can't inserted!!");
                                            }

                                         break;

                                        case 2:

                                            System.out.println("You choose Local Product !");
                                            System.out.println("            --            ");
                                            System.out.print("Enter Product ID : ");
                                            String pID2 = scan.next();

                                            System.out.print("Enter Product Name : ");
                                            String pName2 = scan.next();

                                            System.out.print("Enter Product Available Quantity : ");
                                            int pAvailableQuantity2 = scan.nextInt();

                                            System.out.print("Enter Product Price : ");
                                            double pPrice2 = scan.nextDouble();

                                            System.out.print("Enter Product Countruy name : ");
                                            String pCountryName = scan.next();

                                            ImportedProduct importedProduct = new ImportedProduct();

                                            importedProduct.setPid(pID2);
                                            importedProduct.setName(pName2);
                                            importedProduct.setAvailableQuantity(pAvailableQuantity2);
                                            importedProduct.setPrice(pPrice2);
                                            importedProduct.setCountryName(pCountryName);

                                            if(market.searchShop(sid1).insertProduct(importedProduct))
                                            {
                                                    System.out.println("Product Inserted For Shop ID : " + sid1);
                                            }
                                            else 
                                            {
                                                    System.out.println("Unsuccessful ...");
                                                    System.out.println("Product can't inserted!!");
                                            }

                                         break;

                                        case 3:

                                            System.out.println("Going back ....");
                                            System.out.println();

                                         break;

                                        default:

                                            System.out.println("You press Wrong keyword !!");
                                            System.out.println();

                                         break;
                                    }
                                    

                                }
                                else 
                                {
                                    System.out.print("Shop ID mismach!!");
                                }

                            


                                break;

                            case 2:

                                System.out.println("-----------------------------------");
                                System.out.println("You Choose Remove Existing Product for a Shop ");
                                System.out.println("-----------------------------------\n");

                                System.out.print("Enter Shop ID: ");
                                String sid2 = scan.next();

                                if(market.searchShop(sid2) != null)
                                {
                                    System.out.println("   Shop Found!! ");

                                    System.out.print("Enter Product ID: ");
                                    String productID2 = scan.next();

                                    //Shop shop = new Shop();
                                    Product product = shop.searchProduct(productID2);

                                    if(product != null)
                                    {
                                        if(shop.removeProduct(product))
                                        {
                                            System.out.println("Successful!!");
                                            System.out.println("Product Removed with ID: " + product.getPid());
                                        }
                                        else
                                        {
                                            System.out.println("Unsuccessful!!");
                                            System.out.println("Product Can Not be Removed......");
                                        }
                                    }
                                
                                }
                                else
							    {
								    System.out.println("Product Does Not Exist !!");
                                }
                                System.out.println("-----------------------------------");


                                break;

                            case 3:

                                System.out.println("-----------------------------------");
                                System.out.println("  You Choose Show All Products ");
                                System.out.println("-----------------------------------\n");
                                shop.showAllProducts();
                                

                                break;

                            case 4:

                                System.out.println("-----------------------------------");
                                System.out.println("  You Choose Search a Product ");
                                System.out.println("-----------------------------------\n");

                                System.out.print("Enter an Product ID to Search: ");
							        String productID = scan.next();
							
							        Product product4 = shop.searchProduct(productID);
							
							        if(product4 != null)
							        {
								        System.out.println("   !!!   Product Found    !!!");
								        System.out.println("Product ID     : "+product4.getPid());
								        System.out.println("Product Name   : "+product4.getName());
                                        System.out.println("Product Price : "+product4.getPrice()+" $");
                                        System.out.println("Product Available Quantity : "+product4.getAvailableQuantity());
                                        
							        }
							        else
							        {
								        System.out.println("Product Does Not Exist");
							        }
                                    
                                    System.out.println("-----------------------------------");

                                break;

                            case 5:
                                System.out.println("Going back ....");
                                System.out.println();
                                break;

                            default:

                                System.out.println("You Press Wrong keyword !!");

                                break;

                            
                        }

                        
                    }
                    choice = 7;

                break;

                case 4: // Add Sell management
                    System.out.println("-----------------------------------");
                    System.out.println("You Choose Quantity Add Sell option");
                    System.out.println("-----------------------------------\n");
                    while(choice != 5)
                    {
                        System.out.println("What do you want to do?");
                        System.out.println("\t1. Add Product");
                        System.out.println("\t2. Sell Product");
                        System.out.println("\t3. Show Add Sell History");
                        System.out.println("\t4. Go Back to Main Menu");
                        System.out.println("-----------------------------------\n");
                        System.out.println();
                        System.out.print("Enter Your Choice: ");
                        choice = scan.nextInt();
                        switch(choice)
                        {
                            case 1:

                                System.out.println("-----------------------------------");
                                System.out.println("  You Choose Add Product ");
                                System.out.println("-----------------------------------\n");

                                System.out.print("Enter shop ID : ");
                                String sID1 = scan.next();

                                if(market.searchShop(sID1) != null)
                                {
                                    System.out.print("Enter Product ID : ");
                                    String pID1 = scan.next();
                                    
                                    if(market.searchShop(sID1).searchProduct(pID1) != null)
                                    {
                                        System.out.print("Enter Product quantity to add : ");
                                        int addAvailableQuantity1 = scan.nextInt();

                                        if(market.searchShop(sID1).searchProduct(pID1).addQuantity(addAvailableQuantity1))
                                        {
                                            System.out.println("Successfull...");
                                            System.out.println("Added Product !!");
                                            fileReadWrite.writeInFile("Added: "+addAvailableQuantity1+" in Product ID: "+ pID1 + " by Shop ID: "+sID1);
                                            fileReadWrite.writeInFile("------------------------------------------------");
                                        }
                                        else
                                        {
                                            System.out.println("Unsuccessfull !! Doesn't added product !");
                                            fileReadWrite.writeInFile("Unsuccessfull add attempt by Shop ID: "+sID1);
                                            fileReadWrite.writeInFile("------------------------------------------------");
                                        }

                                    }
                                    else
                                    {
                                        System.out.println("Invalade Product ID !! !! ");
                                    }

                                }
                                else 
                                {
                                    System.out.println("Product ID Missmatch !! ");
                                }

                             break;

                            case 2:

                                System.out.println("-----------------------------------");
                                System.out.println("  You Choose Sell Product ");
                                System.out.println("-----------------------------------\n");

                                System.out.print("Enter shop ID : ");
                                String sID2 = scan.next();

                                if(market.searchShop(sID2) != null)
                                {
                                    System.out.print("Enter Product ID : ");
                                    String pID1 = scan.next();
                                    
                                    if(market.searchShop(sID2).searchProduct(pID1) != null)
                                    {
                                        System.out.print("Enter Product quantity to Sell : ");
                                        int addAvailableQuantity1 = scan.nextInt();

                                        if(market.searchShop(sID2).searchProduct(pID1).sellQuantity(addAvailableQuantity1))
                                        {
                                            System.out.println("Successfull...");
                                            System.out.println("Sell Product !!");
                                            fileReadWrite.writeInFile("Sell: "+addAvailableQuantity1+" in Product ID: "+ pID1 + " by Shop ID: "+sID2);
                                            fileReadWrite.writeInFile("------------------------------------------------");
                                        }
                                        else
                                        {
                                            System.out.println("Unsuccessfull !! Doesn't sell product !");
                                            fileReadWrite.writeInFile("Unsuccessfull sell attempt by Shop ID: "+sID2);
                                            fileReadWrite.writeInFile("------------------------------------------------");
                                        }

                                    }
                                    else
                                    {
                                        System.out.println("Invalade Product ID !! !! ");
                                    }

                                }
                                else 
                                {
                                    System.out.println("Product ID Missmatch !! ");
                                }

                             break;

                            case 3:

                                System.out.println("-----------------------------------");
                                System.out.println("  You Choose Show Add Sell History ");
                                System.out.println("-----------------------------------\n");
                                fileReadWrite.readFromFile();

                             break;

                            case 4:

                                System.out.println("Going back ....");
                                System.out.println();
                                choice = 5;

                             break;

                            default:

                                System.out.println("You Press Wrong keyword !!");

                             break;
                        }
                    }
                    choice = 7;
                break;

                case 5:

                    System.out.println(" Exited ... ");
                    choice = 5;

                break;

                default:

                System.out.println(" You press wrong keyword !!   ");

                break;

            }


        }while(choice != 5);

        
    }

    

}

