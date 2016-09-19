package spittr.data;

import java.util.List;

import spittr.spittle.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max,int count);
}
