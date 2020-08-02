public interface IEntityRepository<T extends IEntity > { //<> içeriğini implements yerine extends javanın istediği bir durum olarak karşımıza çıkar.
    void add(T entity); //entity genel olarak veri tabanı nesnesi anlamına gelir.
    void delete(T entity);
    void update(T entity);
}
