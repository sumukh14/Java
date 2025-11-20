interface PermissionAccess{}

    class Admin implements PermissionAccess{
        String name;
        Admin(String name){
            this.name = name;
        }
    }

    class Developer {
        String name;
        Developer(String name){
            this.name = name;
        }
    }
    class PermissionManager{
        void grantPermission(Object obj ){
            if(obj instanceof PermissionAccess){
                System.out.println("Permission Access. ");
            }else {
                System.out.println("Permission denied");
            }
        }
    }
    public class Marker {
        public static void main(String[] args) {
            Admin e1 = new Admin("Sumukh");
            Developer e2 = new Developer("Gaurav");
            PermissionManager manager  = new PermissionManager();
            manager.grantPermission(e1);
            manager.grantPermission(e2);
        }
    }

