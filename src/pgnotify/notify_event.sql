/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  PROFE DEVITECH
 * Created: 10/01/2023
 */

CREATE OR REPLACE FUNCTION notify_event() RETURNS TRIGGER AS $$
  DECLARE
    record RECORD;
    payload JSON;
  BEGIN
    IF (TG_OP = 'DELETE') THEN
      record = OLD;
    ELSE
      record = NEW;
    END IF;

    payload = json_build_object('table', TG_TABLE_NAME,
                                'action', TG_OP,
                                'data', row_to_json(record));

    PERFORM pg_notify('events', payload::text);

    RETURN NULL;
  END;
$$ LANGUAGE plpgsql;

