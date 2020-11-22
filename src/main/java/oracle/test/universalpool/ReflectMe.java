package oracle.test.universalpool;


import java.lang.reflect.Method;

import javax.management.ReflectionException;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.MethodInterceptor;
import oracle.test.universalpool.xx.C1;

public class ReflectMe {

	public static void main(String[] args) {
		xx xNormal = new xx();
		IField field = new IField() {
			
			@Override
			public String m1(Object ar1, Object ar2) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		field = (IField)new C1();
		field.m2("ss", "bb");
		// TODO Auto-generated method stub
		Enhancer enhancer = new Enhancer();
		Enhancer enhancer2 = new Enhancer();
		
		enhancer.setSuperclass(xx.class);
		enhancer.setCallback((MethodInterceptor) (obj, method, as, proxy) -> {
		    if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
		        return "Hello Tom!";
		    } else {
		        return proxy.invokeSuper(obj, as);
		    }
		});
		
		enhancer2.setSuperclass(xx.class);
		enhancer2.setCallback(new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args1) throws Throwable {
				System.out.println(args1.length);
				if(method.getDeclaringClass() != Object.class && method.getReturnType() == Integer.class) {
					return 8888;
				}else {
//					return proxy.invokeSuper(proxy,args1);
					throw new ReflectionException(new Exception("bleeeeeeeeeeee"));
//					throw new RuntimeException("Do not know what to do.");
				}
			}
		});

		xx superClass = new xx();
		xx proxy  = (xx) enhancer.create();
		xx proxy2  = (xx) enhancer2.create();
//		String result =Enhancer.class.getClassLoader().getResource("net.sf.cglib.proxy.Enhancer").getPath();
		String result =Enhancer.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		System.out.println(" --*** -- " + result);
		
		String ss = proxy.sayHello("iooo");
//		System.out.println(proxy.hsss());
		System.out.println(proxy.getClass().toString());
		System.out.println(superClass.getClass().toString());
		System.out.println(proxy.hsss());
		System.out.println(ss);
		System.out.println("proxy2  - hsss()-- >  "+proxy2.hsss());
		System.out.println("proxy2  - sayHello-- >  "+proxy2.sayHello("iiiii"));
		
		
//		package.ClassName.class.getClassLoader().getResource("package.ClassName");
	}
	

	
}

