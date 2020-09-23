/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeManage;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;

/**
 *
 *
 */
public class DBManager {

 private static DB database;

 public static DB getDatabase() throws UnknownHostException
 {
 if(database == null)
 {
 MongoClient mongo;
 mongo = new MongoClient("localhost", 27017);
 database = mongo.getDB("TimeManageDB_java");
 }
 return database;
 }
}

