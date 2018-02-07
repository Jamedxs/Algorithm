package com.dxs.leetcode.Hashtable;

import sun.awt.geom.Crossings;

import java.util.*;

/**
 * @Author: Jamedxs
 * @Description:
 * @create 2018-02-07 下午2:59
 */
public class EmployeeImportance {
    Map<Integer,Employee> map;
    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        for (Employee e : employees){
            map.put(e.id,e);
        }

        return depthFirstSearch(id);
    }

    public int depthFirstSearch(int id){
        Employee employee = map.get(id);
        int value = employee.importance;
        for(Integer subid: employee.subordinates){
            value += depthFirstSearch(subid);
        }

        return value;
    }

    public int getImportance2(List<Employee> employees, int id) {
        Map<Integer,Employee> map = new HashMap<>();
        for (Employee e : employees){
            map.put(e.id,e);
        }
        int total = 0;

        Queue<Employee> queue = new LinkedList<>();

        queue.offer(map.get(id));

        while(!queue.isEmpty()){
            Employee employee = queue.poll();
            total += employee.importance;
            for (int eid : employee.subordinates){
                queue.offer(map.get(eid));
            }
        }

        return total;
    }

}


class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
