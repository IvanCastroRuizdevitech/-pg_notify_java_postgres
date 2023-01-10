/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  PROFE DEVITECH
 * Created: 10/01/2023
 */
CREATE TRIGGER notify_newtable_event
AFTER INSERT OR UPDATE OR DELETE ON newtable
  FOR EACH ROW EXECUTE PROCEDURE notify_event();
