class Main {
    public static void main(String[] args) {
      Heroes hero = new Heroes();
  
      hero.setProfile("Nurdilla", 20, 160);
      hero.profile();
      
  
      // jalankan aktivitas disini...
      hero.jalan();
      hero.jalan();
      hero.jalan();
      hero.jalan();
      hero.jalan();

      hero.lari();
      hero.lari();

      hero.makan();
      hero.makan();
      hero.makan();

      hero.minum();

      hero.lompat();
      hero.lompat();
      hero.lompat();

      hero.duduk();
      
      // tampilkan status terkini...
      hero.profile();
      
    }
  }