package com.practicle.factorymethoddesignpattern;

public class Application {

    public static void main(String[] args) {

        Package package1 = PackageFactory.CreatePackage(PackageCode.BASIC);
        System.out.println(package1);

        Package package2 = PackageFactory.CreatePackage(PackageCode.SILVER);
        System.out.println(package2);

        Package package3 = PackageFactory.CreatePackage(PackageCode.GOLD);
        System.out.println(package3);

        Package package4 = PackageFactory.CreatePackage(PackageCode.PLATINUM);
        System.out.println(package4);





    }
}
