public class PackageInfoExample {
    public static void main(String[] args) {
        // Get the Package object for the PackageInfoExample class
        Package pkg = Package.class.getPackage();

        // Print package information
        System.out.println("Package Name: " + pkg.getName());
        System.out.println("Specification Title: " + pkg.getSpecificationTitle());
        System.out.println("Specification Version: " + pkg.getSpecificationVersion());
        System.out.println("Implementation Title: " + pkg.getImplementationTitle());
        System.out.println("Implementation Version: " + pkg.getImplementationVersion());
        System.out.println("Implementation Vendor: " + pkg.getImplementationVendor());
        System.out.println("Is Sealed: " + pkg.isSealed());
        // System.out.println("Seal Base: " + ((Object) pkg).getSealBase());
    }
}
