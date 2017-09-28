package org.henry;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;



public class PersonServiceTest  
{  
    @Mock  
    private PersonDao personDAO;  
    private PersonService personService;  
    @Before  
    public void setUp()  
        throws Exception  
    {  
        MockitoAnnotations.initMocks( this );  
        personService = new PersonService( personDAO );  
    }  
    @Test  
    public void shouldUpdatePersonName()  
    {  
        Person person = new Person( 1, "Phillip" );  
        Mockito.when( personDAO.fetchPerson( 1 ) ).thenReturn( person );  
        boolean updated = personService.update( 1, "David" );  
        assertTrue( updated );  
        
        
        
        
        Mockito.verify( personDAO ).fetchPerson( 1 );  
        ArgumentCaptor<Person> personCaptor = ArgumentCaptor.forClass( Person.class );  
        Mockito.verify( personDAO ).update( personCaptor.capture() );  
        Person updatedPerson = personCaptor.getValue();  
        assertEquals( "David", updatedPerson.getPersonName() );  
        // asserts that during the test, there are no other calls to the mock object.  
        Mockito.verifyNoMoreInteractions( personDAO );  
    }  
    
    
    
    @Test  
    public void shouldNotUpdateIfPersonNotFound()  
    {  
    	Mockito.when( personDAO.fetchPerson( 1 ) ).thenReturn( null );  
        boolean updated = personService.update( 1, "David" );  
        assertFalse( updated );  
        Mockito.verify( personDAO ).fetchPerson( 1 );  
        Mockito.verifyZeroInteractions( personDAO );  
        Mockito.verifyNoMoreInteractions( personDAO );  
    }  
} 