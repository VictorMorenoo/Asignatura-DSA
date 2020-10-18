import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ColaImpTest
{
    Cola<Integer> q;

    @Before
    public void setUp() throws Exception
    {
        this.q = (QueueImpl<Integer>) new QueueImpl<Integer>(5);  //No lo tenemos
        this.q.push(1);
        this.q.push(2);
        this.q.push(3);
    }

    @After
    public void tearDown()
    {
        this.q = null;
    }

    @Test
    public void testPush1() throws Exception
    {
        Assert.assertEquals(3,this.q.size());
        this.q.push(4);
        Assert.assertEquals(3,this.q.size());
    }

    @Test
    public void testPush2() throws Exception
    {
        Assert.assertEquals(3,this.q.size());
        this.q.push(4);
        this.q.push(5);
        Assert.assertEquals(5,this.q.size());
    }

    @Test(expected = FullQueueException.class)
    public void testPushFull() throws Exception
    {
        Assert.assertEquals(3,this.q.size());
        this.q.push(4);
        this.q.push(5);
        this.q.push(6);
        Assert.assertEquals(5,this.q.size());
    }

    @Test
    public void testPop1() throws Exception
    {
        Assert.assertEquals(3,this.q.size());
        Integer uno = this.q.pop();
        Assert.assertEquals(2,this.q.size());
        //Assert.assertEquals(1,uno);

        Integer dos = this.q.pop();
        Assert.assertEquals(1,this.q.size());
       // Assert.assertEquals(2,dos);

        Integer tres = this.q.pop();
        Assert.assertEquals(0,this.q.size());
       // Assert.assertEquals(3,tres);
    }

    @Test(expected = EmptyQueueException.class)
    public void testPopEmpty() throws Exception
    {
        Assert.assertEquals(3,this.q.size());
        Integer uno = this.q.pop();
       // Assert.assertEquals(1,uno);
        Assert.assertEquals(2,this.q.size());
    }

}
