public class Main {
    public static void main(String[] args) throws MyExeption {



        Fighttable[] headquarters = new Fighttable[9];

        General general = new General("Main General");
        headquarters[0] = general;
        general.getName();

        Сommander com1 = new Сommander("Commander1");
        System.out.println(general.getName());
        com1.setCurator(general);
        headquarters[1] = com1;


        Сommander com2 = new Сommander("Commander2");
        com2.setCurator(general);
        headquarters[2] = com2;

             for (int i = 3; i < 9; i++){
           Soldier soldier = new Soldier("Soldier"+i);
           if (i < 6){soldier.setCurator(com1);}
           else {soldier.setCurator(com2);}
            headquarters[i] = soldier;
        }

        for (Fighttable h: headquarters) {
            ((Human)h).singASong();
h.canFight();
h.canReport();
            System.out.println();
        }




    }


}
