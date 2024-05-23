package Structural.Repository;

public interface IEntityRepository <T extends IEntity> {
    void add(T value);
    void delete(T value);
    void update(T value);
}
