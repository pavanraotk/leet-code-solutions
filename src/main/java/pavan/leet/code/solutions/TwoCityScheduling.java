package pavan.leet.code.solutions;

import java.util.*;

public class TwoCityScheduling {

    public int twoCitySchedCost(int[][] costs) {
        int numberOfPeopleInEachCity = getMinimumNumberOfPeopleInEachCity(costs);
        Map<Integer, Map<Integer, Integer>> costPerPersonForCities = createMapForCosts(costs);
        List<Integer> minimumCostsPerPerson = getMinimumCostsPerCity(costPerPersonForCities, numberOfPeopleInEachCity);
        return getSumFromMinCosts(minimumCostsPerPerson);

    }

    private int getMinimumNumberOfPeopleInEachCity(int[][] costs) {
        return costs.length / 2;
    }

    private List<Integer> getMinimumCostsPerCity(Map<Integer, Map<Integer, Integer>> costPerPersonForCities, int numberOfPeopleInEachCity) {
        List<Integer> cost = new ArrayList<>();
        Map<Integer, Integer> citiesToBeRemoved = new HashMap<>();
        while (cost.size() < (2 * numberOfPeopleInEachCity)) {
            for (Map.Entry<Integer, Map<Integer, Integer>> perCityCosts : costPerPersonForCities.entrySet()) {
                if (citiesToBeRemoved.isEmpty()) {
                    Integer minimumCostCity = getMinimumCostCityForPerson((Map) perCityCosts.getValue());
                    addCostAndRemoveCity(cost, citiesToBeRemoved, (Map) perCityCosts.getValue(), minimumCostCity);
                } else {
                    Map<Integer, Integer> perCityCostsForEachPerson = (Map) perCityCosts.getValue();
                    for (Map.Entry<Integer, Integer> citiesAndVisited : citiesToBeRemoved.entrySet()) {
                        if (citiesAndVisited.getValue() % numberOfPeopleInEachCity == 0) {
                            perCityCostsForEachPerson.remove(citiesAndVisited.getKey());
                        }
                    }
                    Integer minimumCostCity = getMinimumCostCityForPerson(perCityCostsForEachPerson);
                    addCostAndRemoveCity(cost, citiesToBeRemoved, perCityCostsForEachPerson, minimumCostCity);
                }
            }
        }
        return cost;
    }

    private void addCostAndRemoveCity(List<Integer> cost, Map<Integer, Integer> citiesToBeRemoved, Map<Integer, Integer> perCityCostsForEachPerson, Integer minimumCostCity) {
        cost.add(perCityCostsForEachPerson.get(minimumCostCity));
        perCityCostsForEachPerson.remove(minimumCostCity);
        citiesToBeRemoved.merge(minimumCostCity, 1, (a, b) -> a + b);
    }

    private Integer getMinimumCostCityForPerson(Map<Integer, Integer> perCityCostsForEachPerson) {
        Integer city = null;
        Integer minCost = null;
        for (Map.Entry<Integer, Integer> cityCostEntry : perCityCostsForEachPerson.entrySet()) {
            if (minCost == null) {
                minCost = cityCostEntry.getValue();
                city = cityCostEntry.getKey();
            } else if (minCost > cityCostEntry.getValue()) {
                minCost = cityCostEntry.getValue();
                city = cityCostEntry.getKey();
            }
        }
        return city;
    }

    private Map<Integer, Map<Integer, Integer>> createMapForCosts(int[][] costs) {
        Map<Integer, Map<Integer, Integer>> costPerPersonForCities = new HashMap<>();
        for (int person = 0; person < costs.length; person++) {
            int[] costsPerPersonPerCity = costs[person];
            for (int cityIndex = 0; cityIndex < costsPerPersonPerCity.length; cityIndex++) {
                if (costPerPersonForCities.get(person) == null) {
                    Map<Integer, Integer> costsForCity = new HashMap<>();
                    costsForCity.put(cityIndex, costs[person][cityIndex]);
                    costPerPersonForCities.put(person, costsForCity);
                } else {
                    Map<Integer, Integer> costPerPersonPerCity = costPerPersonForCities.get(person);
                    costPerPersonPerCity.put(cityIndex, costs[person][cityIndex]);
                }
            }
        }
        return costPerPersonForCities;
    }

    private int getSumFromMinCosts(List<Integer> minimumCostsPerPerson) {
        int sum = 0;
        for (Integer costsPerPerson : minimumCostsPerPerson) {
            sum = sum + costsPerPerson;
        }
        return sum;
    }

}
