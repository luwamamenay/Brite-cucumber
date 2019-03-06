# new feature
# Tags: optional

Feature: I should be able to schedule successfully testDemos, meetings, calls, todo (Manager Prospective)

  Background:
    Given the user goes to url
    When the "manager" enters valid email and password and going to inventory page
    Then manager clicks on Receipts - My Company Chicago


  Scenario:I should be able to create 20 transfers for certain partner with product, source document number from excel file sheet "<TestDemo>"
    Given manager clicks on Create new transfer
    When manager can add "<partner>", "<product>", "<source_document_number>"
    Then transfer number is displayed


  Scenario Outline: I should be able to schedule successfully testDemos
    Given manager clicks on Create new transfer
     When manager can add "<partner>", "<product>", "<price>"
      And manager schedules "<activity>" with "<notes>"
      #And manager schedules "<month>", "<date>", "<time>"
     #When manager goes to the planned activities page
     Then button Today in Calendar is clickable
    #Then manager should see correct information:
      | name            | <partner>     |
      | product         | <product>     |
      | price           | <price>       |
      | scheduled date  | <month> <date>|
      | scheduled time  | <time>        |

    Examples:
    |partner	                |product	                |price	 |activity	    |notes	        |month	|date   |time       |
    |ACD                 	    |[CARD] Graphics Card       |884.23	 |TestDemo		|testing item	|April	|27	    |12:30:00 PM|
    |ASUSTeK, James Miller	    |[CONS_DEL01] Server        |567.71	 |TestDemo		|presentation   |April	|21	    |14:00:00 PM|
    |ASUSTeK, Matthew	        |[CONS_DEL02] Little server	|463.88	 |TestDemo		|review	        |April	|21	    |7:30:00 AM |
    |ASUSTeK, Peter Mitchell	|[CPUi5] Processor Core     |431.74	 |TestDemo		|pricing	    |April	|29	    |20:00:00 PM|
    |Agrolait, Laith Jubair	    |[CONS_DEL03] Basic Computer|280.8	 |TestDemo		|testing item	|April	|12     |11:00:00 AM|
    |Agrolait, Michel Fletcher  |[CARD] Graphics Card	    |486.09	 |TestDemo		|presentation	|April	|18     |18:00:00 PM|
    |BriteErp, Brad Pitt        |[CONS_DEL01] Server        |160.51	 |TestDemo		|review	        |April	|22	    |15:00:00 PM|
    |ACD, Partner1	            |[CONS_DEL02] Little server |385.92	 |TestDemo		|pricing        |April	|22     |10:30:00 AM|
    |ACD	                    |[CPUi5] Processor Core i5  |143.83	 |TestDemo		|testing item   |April	|29	    |8:30:00 AM |
    |ACD, samuel jackson        |[CONS_DEL03] Basic Computer|166.95	 |TestDemo		|presentation   |April	|17	    |8:30:00 AM |
    |ACD, Alex	                |[CARD] Graphics Card	    |884.14	 |TestDemo		|review         |April	|17     |17:00:00 PM|
    |Camptocamp, Benjamin Flores|[CONS_DEL01] Server	    |92.82	 |TestDemo		|pricing     	|April	|13	    |9:30:00 AM |
    |Camptocamp, Phillipp Miller|[CONS_DEL02] Little server	|38.38	 |TestDemo		|testing item	|April	|5	    |16:00:00 PM|
    |Agrolait, Thomas Passot	|[CPUi5] Processor Core i5 2|251.5	 |TestDemo		|presentation   |April	|25	    |13:00:00 PM|
    |China Export, Jacob Taylor	|[CONS_DEL03] Basic Computer|674.47	 |TestDemo		|review	        |April	|23	    |9:30:00 AM |
    |DELL Comp, John Smith	    |[CARD] Graphics Card	    |367.11	 |TestDemo		|pricing        |April	|28	    |10:00:00 AM|
    |Delta PC, Charlie Bernard  |[CONS_DEL01] Server	    |762.73	 |TestDemo		|testing item	|April	|5	    |16:30:00 PM|
    |Delta PC, Morgan Rose      |[CONS_DEL02] Little server |843.91	 |TestDemo		|presentation   |April	|10	    |8:30:00 AM |
    |Delta PC, Albert Aslan	    |[CPUi5] Processor Core i5 2|909.37	 |TestDemo		|review	        |April	|19	    |9:00:00 AM |
    |Delta PC, Richard Ellis    |[CONS_DEL03] Basic Computer|37.26	 |TestDemo		|pricing	    |April	|6	    |8:30:00 AM |
