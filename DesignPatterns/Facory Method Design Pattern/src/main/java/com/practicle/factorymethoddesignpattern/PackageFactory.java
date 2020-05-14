package com.practicle.factorymethoddesignpattern;

public class PackageFactory {

    public  static  Package CreatePackage(PackageCode packageCode){


        switch (packageCode){

            case BASIC: return  new BasicPackage();

            case GOLD:return new GoldPackage();


            case SILVER:return new SilverPackage();


            case PLATINUM:return new PlatinumPackage();


            default:return  null;

        }

    }

}
