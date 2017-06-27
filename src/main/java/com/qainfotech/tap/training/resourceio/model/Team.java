package com.qainfotech.tap.training.resourceio.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ramandeep RamandeepSingh AT QAInfoTech.com
 */
public class Team {

    private final String name;
    private final Integer id;
    private final List<Individual> members;

    public Team(Map<String, Object> teamMap) {
        String name = null;
        Integer id = null;
        List<Individual> members1 = null;

        for (Map.Entry<String, Object> entry : teamMap.entrySet()) {
            if (entry.getKey() == "name") {
                name = entry.getValue().toString();
            }
            if (entry.getKey() == "id") {
                id = (Integer) entry.getValue();
            }
            if (entry.getKey() == "members") {
                members1 = (List<Individual>) entry.getValue();
            }

        }
        this.name = name;
        this.id = id;
        this.members = members1;

    }

    /**
     * get team name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * get team id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * get list of individuals that are members of this team
     *
     * @return
     */
    public List<Individual> getMembers() {
        return members;
    }

    /**
     * get a list of individuals that are members of this team and are also
     * active
     *
     * @return
     */
    public List<Individual> getActiveMembers() {

        List<Individual> list1 = new ArrayList<Individual>();
        Iterator<Individual> itr = members.iterator();
        while (itr.hasNext()) {
            Individual ind = itr.next();
            Boolean a = true;

            Boolean b = ind.isActive();

            if (a == b) {

                list1.add(ind);
            }

        }

        return list1;
    }

    /**
     * get a list of individuals that are members of this team but are inactive
     *
     * @return
     */
    public List<Individual> getInactiveMembers() {

        List<Individual> list1 = new ArrayList<Individual>();

        Iterator<Individual> itr = members.iterator();
        while (itr.hasNext()) {
            Individual ind = itr.next();
            Boolean a = false;
            Boolean b = ind.isActive();

            if (a == b) {
                list1.add(ind);
            }

        }
        return list1;

    }
}
