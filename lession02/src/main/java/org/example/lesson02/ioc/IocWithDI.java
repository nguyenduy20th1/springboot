package org.example.lesson02.ioc;

class IocService {
    public void serve() {
        System.out.println("IocService serve");
    }
}

class IoCClient {
    private IocService iocService;
    public IoCClient(IocService service) {
        this.iocService = service;
    }
    public void doSomething() {
        iocService.serve();
    }
}

public class IocWithDI {
    public static void main(String[] args) {
        IocService service = new IocService();
        IoCClient client = new IoCClient(service);
        client.doSomething();
    }
}
