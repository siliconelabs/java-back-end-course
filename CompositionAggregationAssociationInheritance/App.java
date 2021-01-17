package CompositionAggregationAssociationInheritance;
/*----------------------------------------------------------------------------------------------------------------------

	Sınıflar arası ilişkiler:
	1. Composition (İçerme) (has a): A ile B arasındaki A has a B ilişkisinde aşağıdaki iki kural geçerldir.
	 Ya da aşağıdaki iki kural geçerli ise A ile B arasında bir composition ilişkisi vardır:
	    - A nesnesine ait B nesnesi başka bir nesne tarafından kullanılamayacak
	    - A nesnesine ait B nesnesinin ömrü  aynı olacak*/
class App {
    public static void main(String [] args)
    {
        A x = new A(/*...*/);
        B b=new B();

        x.doWork();
    }
}


class A {
    private B m_b;

    public A(/*...*/)
    {
        m_b = new B(/*...*/);
    }

    public void doWork()

    {
        m_b.doSomething();
    }
    //...
}

class B {
    //...
    public void doSomething()
    {

    }
}


class App2 {
    public static void main(String [] args)
    {
        Car car = new Car(/*...*/);
        Plane plane = new Plane(4/*...*/);

        car.run();
        System.out.println("*************");
        plane.fly();
    }
}

class Plane {
    private Engine[] m_engines;

    private void startEngines()
    {
        for (Engine e : m_engines)
            e.startEngine();
    }

    private void accelerateEngines()
    {
        for (Engine e : m_engines)
            e.accelerateEngine();
    }

    private void slowEngines()
    {
        for (Engine e : m_engines)
            e.slowEngine();
    }

    private void stopEngines()
    {
        for (Engine e : m_engines)
            e.stopEngine();
    }
    public Plane(int n/*...*/)
    {
        m_engines = new Engine[n];
        for (int i = 0; i < n; ++i)
            m_engines[i] = new Engine(/*..*/);
    }

    public void fly()
    {
        startEngines();
        accelerateEngines();

        //...
        slowEngines();
        stopEngines();
    }
}

class Car {
    private Engine m_engine;
    //...

    private void brake()
    {
        m_engine.slowEngine();
    }
    public Car(/*...*/)
    {
        m_engine = new Engine(/*...*/);
    }

    public void run()
    {
        m_engine.startEngine();
        m_engine.accelerateEngine();

        //...
        brake();

        m_engine.stopEngine();
    }
}

class Engine {
    //...

    public void startEngine()
    {
        System.out.println("start engine");
    }

    public void accelerateEngine()
    {
        System.out.println("accelerate engine");
    }

    public void slowEngine()
    {
        System.out.println("slow engine");
    }

    public void stopEngine()
    {
        System.out.println("stop engine");
    }
}

/*----------------------------------------------------------------------------------------------------------------------


    Aggregation ilişkisinin genel biçimi
----------------------------------------------------------------------------------------------------------------------*/
class App3 {
    public static void main(String [] args)
    {
        B1 x = new B1(/*...*/);
        A1 y = new A1(x/*...*/);

        y.doWork();

        //...

        B1 z = new B1(/*...*/);



        y.doWork();
    }
}

class A1 {
    private B1 m_b;

    public A1(B1 b/*...*/)
    {
       m_b=b;
    }

    public void doWork()
    {
        m_b.doSomething();
    }

    public B1 getB()
    {return m_b;}


}

class B1 {
    //...
    public void doSomething()
    {
        //...
    }
}


/*----------------------------------------------------------------------------------------------------------------------
    Connection ve Statement arasındaki aggregation ilişkisi
----------------------------------------------------------------------------------------------------------------------*/


class App4 {
    public static void main(String [] args)
    {
        String url = "jdbc:postgresql://192.34.56.78:5432/devicesappdb";
        String username = "postgres";
        String password = "csd1993";

        Connection connection = new Connection(url, username, password);
        Statement statementInsert = new Statement(connection, "insert into devices (name, host) values (?, ?)");
        //...

        statementInsert.executeNonQuery();

        Statement statementQuery = new Statement(connection, "select * from device where device_id > ?");

        statementQuery.executeQuery();
    }
}

class Statement {
    private Connection m_connection;
    private String m_cmdText;

    private void connect()
    {
        System.out.printf("URL:%s%n", m_connection.getUrl());
        System.out.printf("Username:%s%n", m_connection.getUsername());
        System.out.printf("Password:%s%n", m_connection.getPassword());
    }
    public Statement(Connection connection, String cmdText)
    {
        m_connection = connection;
        m_cmdText = cmdText;
    }

    public Connection getConnection()
    {
        return m_connection;
    }

    public void setConnection(Connection connection)
    {
        m_connection = connection;
    }

    public String getCmdText()
    {
        return m_cmdText;
    }

    public void setCmdText(String cmdText)
    {
        m_cmdText = cmdText;
    }

    public void executeQuery()
    {
        System.out.println("executeQuery");
        connect();
        System.out.printf("Command:%s%n", m_cmdText);
    }

    public void executeNonQuery()
    {
        System.out.println("executeNonQuery");
        connect();
        System.out.printf("Command:%s%n", m_cmdText);
    }
}

class Connection {
    private String m_url;
    private String m_username;
    private String m_password;

    public Connection(String url, String username, String password)
    {
        m_url = url;
        m_username = username;
        m_password = password;
    }

    public String getUrl()
    {
        return m_url;
    }

    public void setUrl(String url)
    {
        m_url = url;
    }

    public String getUsername()
    {
        return m_username;
    }

    public void setUsername(String username)
    {
        m_username = username;
    }

    public String getPassword()
    {
        return m_password;
    }

    public void setPassword(String password)
    {
        m_password = password;
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    Association ilişkisinin genel biçimi
----------------------------------------------------------------------------------------------------------------------*/


class App5 {
    public static void main(String [] args)
    {
        B4 x = new B4(/*...*/);
        A4 y = new A4(/**/);
        B4 z = new B4(/*...*/);

        y.doWork(x);
        y.doWork(z);
    }
}

class A4 {

    public void doWork(B4 b)
    {
        b.doSomething();
    }
}
class B4 {
    public void doSomething()
    {
        //...
    }
}

/*----------------------------------------------------------------------------------------------------------------------
    Taxi, Driver ve Client sınıfları arasındaki ilişkiler
----------------------------------------------------------------------------------------------------------------------*/


class App6 {
    public static void main(String [] args)
    {
        Client client1 = new Client(/*...*/);
        Client client2 = new Client(/*...*/);

        Driver driver = new Driver(/*...*/);

        Taxi taxi = new Taxi(driver/*...*/);

        taxi.take(client1);

        taxi.take(client2);

        Driver driver2 = new Driver(/*...*/);

        taxi.setDriver(driver2);

        taxi.take(client1);
    }
}

class Taxi {
    Engine e;
    private Driver m_driver;

    public Taxi(Driver driver)

    {
        this.m_driver = driver;
        this.e=new Engine();
    }

    public Driver getDriver()
    {
        return m_driver;
    }

    public void setDriver(Driver driver)
    {
        m_driver = driver;
    }

    public void take(Client client)
    {
        client.paraode();
    }
}

class Driver {
    //...
}

class Client {
    public void paraode(){}
}