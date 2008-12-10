package firm.bindings;
/* WARNING: Automatically generated file */
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import com.sun.jna.NativeLong;


public interface binding_irgraph extends Library {
	public static enum ip_view_state {
		ip_view_no(),
		ip_view_valid(),
		ip_view_invalid();
		public final int val;
		private static class C { static int next_val; }

		ip_view_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ip_view_state() {
			this.val = C.next_val++;
		}
		
		public static ip_view_state getEnum(int val) {
			for(ip_view_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum op_pin_state {
		op_pin_state_floats(0),
		op_pin_state_pinned(1),
		op_pin_state_exc_pinned(),
		op_pin_state_mem_pinned();
		public final int val;
		private static class C { static int next_val; }

		op_pin_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		op_pin_state() {
			this.val = C.next_val++;
		}
		
		public static op_pin_state getEnum(int val) {
			for(op_pin_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum mtp_additional_property {
		mtp_no_property(0),
		mtp_property_const(1),
		mtp_property_pure(2),
		mtp_property_noreturn(4),
		mtp_property_nothrow(8),
		mtp_property_naked(16),
		mtp_property_malloc(32),
		mtp_property_weak(64),
		mtp_property_returns_twice(128),
		mtp_property_intrinsic(256),
		mtp_property_runtime(512),
		mtp_property_private(1024),
		mtp_property_has_loop(2048),
		mtp_property_inherited((1<<31));
		public final int val;
		private static class C { static int next_val; }

		mtp_additional_property(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		mtp_additional_property() {
			this.val = C.next_val++;
		}
		
		public static mtp_additional_property getEnum(int val) {
			for(mtp_additional_property entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum irg_phase_state {
		phase_building(),
		phase_high(),
		phase_low(),
		phase_backend();
		public final int val;
		private static class C { static int next_val; }

		irg_phase_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		irg_phase_state() {
			this.val = C.next_val++;
		}
		
		public static irg_phase_state getEnum(int val) {
			for(irg_phase_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum irg_outs_state {
		outs_none(),
		outs_consistent(),
		outs_inconsistent();
		public final int val;
		private static class C { static int next_val; }

		irg_outs_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		irg_outs_state() {
			this.val = C.next_val++;
		}
		
		public static irg_outs_state getEnum(int val) {
			for(irg_outs_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum irg_extblk_state {
		extblk_none(0),
		extblk_valid(1),
		extblk_invalid(2);
		public final int val;
		private static class C { static int next_val; }

		irg_extblk_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		irg_extblk_state() {
			this.val = C.next_val++;
		}
		
		public static irg_extblk_state getEnum(int val) {
			for(irg_extblk_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum irg_dom_state {
		dom_none(),
		dom_consistent(),
		dom_inconsistent();
		public final int val;
		private static class C { static int next_val; }

		irg_dom_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		irg_dom_state() {
			this.val = C.next_val++;
		}
		
		public static irg_dom_state getEnum(int val) {
			for(irg_dom_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum irg_loopinfo_state {
		loopinfo_none(0),
		loopinfo_constructed(1),
		loopinfo_valid(2),
		loopinfo_cf(4),
		loopinfo_inter(8),
		loopinfo_consistent((irg_loopinfo_state.loopinfo_constructed.val|irg_loopinfo_state.loopinfo_valid.val)),
		loopinfo_inconsistent(irg_loopinfo_state.loopinfo_constructed.val),
		loopinfo_ip_consistent(((irg_loopinfo_state.loopinfo_constructed.val|irg_loopinfo_state.loopinfo_inter.val)|irg_loopinfo_state.loopinfo_valid.val)),
		loopinfo_ip_inconsistent((irg_loopinfo_state.loopinfo_constructed.val|irg_loopinfo_state.loopinfo_inter.val)),
		loopinfo_cf_consistent(((irg_loopinfo_state.loopinfo_constructed.val|irg_loopinfo_state.loopinfo_cf.val)|irg_loopinfo_state.loopinfo_valid.val)),
		loopinfo_cf_inconsistent((irg_loopinfo_state.loopinfo_constructed.val|irg_loopinfo_state.loopinfo_cf.val)),
		loopinfo_cf_ip_consistent((((irg_loopinfo_state.loopinfo_constructed.val|irg_loopinfo_state.loopinfo_cf.val)|irg_loopinfo_state.loopinfo_inter.val)|irg_loopinfo_state.loopinfo_valid.val)),
		loopinfo_cf_ip_inconsistent(((irg_loopinfo_state.loopinfo_constructed.val|irg_loopinfo_state.loopinfo_cf.val)|irg_loopinfo_state.loopinfo_inter.val));
		public final int val;
		private static class C { static int next_val; }

		irg_loopinfo_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		irg_loopinfo_state() {
			this.val = C.next_val++;
		}
		
		public static irg_loopinfo_state getEnum(int val) {
			for(irg_loopinfo_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum irg_callee_info_state {
		irg_callee_info_none(),
		irg_callee_info_consistent(),
		irg_callee_info_inconsistent();
		public final int val;
		private static class C { static int next_val; }

		irg_callee_info_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		irg_callee_info_state() {
			this.val = C.next_val++;
		}
		
		public static irg_callee_info_state getEnum(int val) {
			for(irg_callee_info_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum irg_inline_property {
		irg_inline_any(),
		irg_inline_forbidden(),
		irg_inline_recomended(),
		irg_inline_forced(),
		irg_inline_forced_no_body();
		public final int val;
		private static class C { static int next_val; }

		irg_inline_property(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		irg_inline_property() {
			this.val = C.next_val++;
		}
		
		public static irg_inline_property getEnum(int val) {
			for(irg_inline_property entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	public static enum ir_resources_enum_t {
		IR_RESOURCE_BLOCK_VISITED((1<<0)),
		IR_RESOURCE_BLOCK_MARK((1<<1)),
		IR_RESOURCE_IRN_VISITED((1<<2)),
		IR_RESOURCE_IRN_LINK((1<<3)),
		IR_RESOURCE_LOOP_LINK((1<<4)),
		IR_RESOURCE_PHI_LIST((1<<5)),
		IR_RESOURCE_IRG_LINK((1<<6)),
		IR_RESOURCE_ENTITY_LINK((1<<8)),
		IR_RESOURCE_LOCAL_MASK(255),
		IR_RESOURCE_GLOBAL_MASK(65280);
		public final int val;
		private static class C { static int next_val; }

		ir_resources_enum_t(int val) {
			this.val = val;
			C.next_val = val + 1;
		}
		ir_resources_enum_t() {
			this.val = C.next_val++;
		}
		
		public static ir_resources_enum_t getEnum(int val) {
			for(ir_resources_enum_t entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}
	Pointer get_current_ir_graph();
	void set_current_ir_graph(Pointer graph);
	Pointer new_ir_graph(Pointer ent, int n_loc);
	void free_ir_graph(Pointer irg);
	int is_ir_graph(Pointer thing);
	Pointer get_irg_entity(Pointer irg);
	void set_irg_entity(Pointer irg, Pointer ent);
	Pointer get_irg_frame_type(Pointer irg);
	void set_irg_frame_type(Pointer irg, Pointer ftp);
	Pointer get_irg_start_block(Pointer irg);
	void set_irg_start_block(Pointer irg, Pointer node);
	Pointer get_irg_start(Pointer irg);
	void set_irg_start(Pointer irg, Pointer node);
	Pointer get_irg_end_block(Pointer irg);
	void set_irg_end_block(Pointer irg, Pointer node);
	Pointer get_irg_end(Pointer irg);
	void set_irg_end(Pointer irg, Pointer node);
	Pointer get_irg_end_reg(Pointer irg);
	void set_irg_end_reg(Pointer irg, Pointer node);
	Pointer get_irg_end_except(Pointer irg);
	void set_irg_end_except(Pointer irg, Pointer node);
	Pointer get_irg_initial_exec(Pointer irg);
	void set_irg_initial_exec(Pointer irg, Pointer node);
	Pointer get_irg_frame(Pointer irg);
	void set_irg_frame(Pointer irg, Pointer node);
	Pointer get_irg_tls(Pointer irg);
	void set_irg_tls(Pointer irg, Pointer node);
	Pointer get_irg_initial_mem(Pointer irg);
	void set_irg_initial_mem(Pointer irg, Pointer node);
	Pointer get_irg_args(Pointer irg);
	void set_irg_args(Pointer irg, Pointer node);
	Pointer get_irg_value_param_base(Pointer irg);
	void set_irg_value_param_base(Pointer irg, Pointer node);
	Pointer get_irg_current_block(Pointer irg);
	void set_irg_current_block(Pointer irg, Pointer node);
	Pointer get_irg_bad(Pointer irg);
	void set_irg_bad(Pointer irg, Pointer node);
	Pointer get_irg_no_mem(Pointer irg);
	void set_irg_no_mem(Pointer irg, Pointer node);
	int get_irg_n_locs(Pointer irg);
	NativeLong get_irg_graph_nr(Pointer irg);
	int get_irg_idx(Pointer irg);
	/* irg_phase_state */int get_irg_phase_state(Pointer irg);
	void set_irg_phase_state(Pointer irg, /* irg_phase_state */int state);
	/* op_pin_state */int get_irg_pinned(Pointer irg);
	/* irg_outs_state */int get_irg_outs_state(Pointer irg);
	void set_irg_outs_inconsistent(Pointer irg);
	/* irg_extblk_state */int get_irg_extblk_state(Pointer irg);
	void set_irg_extblk_inconsistent(Pointer irg);
	/* irg_dom_state */int get_irg_dom_state(Pointer irg);
	/* irg_dom_state */int get_irg_postdom_state(Pointer irg);
	void set_irg_doms_inconsistent(Pointer irg);
	/* irg_loopinfo_state */int get_irg_loopinfo_state(Pointer irg);
	void set_irg_loopinfo_state(Pointer irg, /* irg_loopinfo_state */int s);
	void set_irg_loopinfo_inconsistent(Pointer irg);
	void set_irp_loopinfo_inconsistent();
	/* irg_callee_info_state */int get_irg_callee_info_state(Pointer irg);
	void set_irg_callee_info_state(Pointer irg, /* irg_callee_info_state */int s);
	/* irg_inline_property */int get_irg_inline_property(Pointer irg);
	void set_irg_inline_property(Pointer irg, /* irg_inline_property */int s);
	int get_irg_additional_properties(Pointer irg);
	void set_irg_additional_properties(Pointer irg, int property_mask);
	void set_irg_additional_property(Pointer irg, /* mtp_additional_property */int flag);
	void set_irg_link(Pointer irg, Pointer thing);
	Pointer get_irg_link(Pointer irg);
	void inc_irg_visited(Pointer irg);
	NativeLong get_irg_visited(Pointer irg);
	void set_irg_visited(Pointer irg, NativeLong i);
	NativeLong get_max_irg_visited();
	void set_max_irg_visited(int val);
	NativeLong inc_max_irg_visited();
	void inc_irg_block_visited(Pointer irg);
	NativeLong get_irg_block_visited(Pointer irg);
	void set_irg_block_visited(Pointer irg, NativeLong i);
	void ir_reserve_resources(Pointer irg, int resources);
	void ir_free_resources(Pointer irg, int resources);
	int ir_resources_reserved(Pointer irg);
	void normalize_proj_nodes(Pointer irg);
	void set_irg_loc_description(Pointer irg, int n, Pointer description);
	Pointer get_irg_loc_description(Pointer irg, int n);
	int get_irg_estimated_node_cnt(Pointer irg);
	int get_irg_last_idx(Pointer irg);
	int get_irg_fp_model(Pointer irg);
	void set_irg_fp_model(Pointer irg, int model);
	NativeLong register_additional_graph_data(NativeLong size);
}