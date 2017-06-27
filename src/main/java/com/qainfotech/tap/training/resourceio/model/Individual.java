package com.qainfotech.tap.training.resourceio.model;

import java.util.Map;

/**
 *
 * @author Ramandeep RamandeepSingh AT QAInfoTech.com
 */
public class Individual {

    private final String name;
    private final Integer id;
    private final Boolean active;

    public Individual(Map<String, Object> individualMap) {
        String name = null;
        Integer id = null;
        Boolean active = null;
        for (Map.Entry<String, Object> entry : individualMap.entrySet()) {
            if (entry.getKey() == "name") {
                name = entry.getValue().toString();
            }
            if (entry.getKey() == "id") {
                id = (Integer) entry.getValue();
            }
            if (entry.getKey() == "active") {
                active = (Boolean) entry.getValue();
            }

        }
        this.name = name;
        this.id = id;
        this.active = active;

    }

    /**
     * get the name of individual
     *
     * @return individual name
     */
    public String getName() {
        return name;
    }

    /**
     * get the employee of of individual
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * get the active status of individual
     *
     * @return
     */
    public Boolean isActive() {

        return active;
    }
}
