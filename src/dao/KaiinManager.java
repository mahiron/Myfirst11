package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.SearchBean;
import vo.KaiinVo;

public class KaiinManager {

	private Connection connection;

	public KaiinManager(Connection connection) {
		super();
		this.connection = connection;
	}

	private static final String KAIINNLIST_SQL =
			"select "
					+ "   kaiin.kaiinNo"
					+ "  ,kaiin.name"
					+ "  ,kaiin.registDate"
					+ " from "
					+ "   kaiin ";

	private static final String KAIINN_SQL =
			"select "
					+ "   kaiin.kaiinNo "
					+ "  ,kaiin.name "
					+ "  ,kaiin.registDate "
					+ "from   "
					+ "   kaiin "
					+ "WHERE "
					+ " kaiinno = ?";

	private static final String REGIIST_SQL =
			"insert into kaiin "
					+ " (kaiinno "
					+ ",name "
					+ ",registDate) "
					+ "values "
					+ " (?,?,?) ";

	public void doRegist(KaiinVo kaiin) {
		PreparedStatement stmt = null;
		try{

			/* Statementの作成 */
			stmt = this.connection.prepareStatement(REGIIST_SQL);

			stmt.setInt(1,kaiin.getId());
			stmt.setString(2,kaiin.getName());
			stmt.setDate(3,kaiin.getDate());

			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public SearchBean doSearch(int id) {
		PreparedStatement stmt = null;
		ResultSet rset = null;
		SearchBean bean = new SearchBean();
		try{

			/* Statementの作成 */
			stmt = this.connection.prepareStatement(KAIINN_SQL);

			stmt.setInt(1,id);

			rset = stmt.executeQuery();


			while(rset.next()) {
				bean.setId(rset.getInt(1));
				bean.setName(rset.getString(2));
				bean.setDate(rset.getDate(3));
				bean.setMessege("検索しました");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return bean;
	}
}
