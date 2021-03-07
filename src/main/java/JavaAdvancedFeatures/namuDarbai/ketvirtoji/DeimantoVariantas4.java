package JavaAdvancedFeatures.namuDarbai.ketvirtoji;

public class DeimantoVariantas4 {

        public static void main(String[] args) {
            Mobile[] mobiles = buildMobileArr();

            Mobile mostExpensive = getMostExpensiveMobile(mobiles);
            System.out.println(mostExpensive);
        }

        public static Mobile getMostExpensiveMobile(Mobile[] mobiles) {
            Mobile mostExpensive = mobiles[0];

            for (Mobile m : mobiles) {
                if (mostExpensive.getPrice() < m.getPrice()) {
                    mostExpensive = m;
                }
            }

            return mostExpensive;
        }

        private static Mobile[] buildMobileArr() {
            return new Mobile[]{
                    new Mobile("3310", "Nokia", 150),
                    new Mobile("X10", "Sony", 500),
                    new Mobile("11", "iPhone", 1700)
            };
        }
}
