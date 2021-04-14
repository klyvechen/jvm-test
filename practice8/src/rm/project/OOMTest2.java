package rm.project;


import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

public class OOMTest2 extends ClassLoader {
    public static void main(String[] args) {
        int j = 0;
        try {
            OOMTest2 test = new OOMTest2();
            for (int i = 0; i < 10000; i++) {
                ClassWriter classWriter = new ClassWriter(0);
                classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                byte[] code = classWriter.toByteArray();
                test.defineClass("Class" + i, code, 0, code.length);
                j++;
            }
        } finally {
            System.out.println(j);
        }
    }
}
