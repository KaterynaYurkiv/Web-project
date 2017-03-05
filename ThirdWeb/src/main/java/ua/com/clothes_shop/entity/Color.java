package ua.com.clothes_shop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

//@NamedQuery(name = "findColor", query = "select c from Color c where c.color =:param")



//������ �� �� ������� ��
@Entity
//��� ���� ��� ������� ���� ����� �� � � ��
@Table(name="color")
public class Color {
	
	//��������� ����
			@Id
			//AUTO_INCTEMENT
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			private int id;
			//��� ���� ��� ������� ���� ����� �� � � ��
			@Column(name="color")
			private String color;
			
//			@ManyToMany
//			@JoinTable(name="item_color_connection",
//			joinColumns=@JoinColumn(name="id_color"),
//			inverseJoinColumns=@JoinColumn(name="id_item_of_clothing"))
//			private List<ItemOfClothing> itemsOfClothing = new ArrayList<>();
			
			@OneToMany(mappedBy="color")
			private List<ItemOfClothing> itemsOfClothing = new ArrayList<>();
			
			public Color() {
				// TODO Auto-generated constructor stub
			}

			public Color(String color) {
				super();
				this.color = color;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public List<ItemOfClothing> getItemsOfClothing() {
				return itemsOfClothing;
			}

			public void setItemsOfClothing(List<ItemOfClothing> itemsOfClothing) {
				this.itemsOfClothing = itemsOfClothing;
			}

			@Override
			public String toString() {
				return "Color [id=" + id + ", color=" + color + "]";
			}
			

			
			

}
