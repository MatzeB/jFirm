package firm.bindings;

/* WARNING: Automatically generated file */
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class binding_irmemory {
	static {
		Native.register("firm");
	}

	public static enum ir_relation {
		ir_relation_false(0),
		ir_relation_equal((1 << 0)),
		ir_relation_less((1 << 1)),
		ir_relation_greater((1 << 2)),
		ir_relation_unordered((1 << 3)),
		ir_relation_less_equal((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val)),
		ir_relation_greater_equal((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_greater.val)),
		ir_relation_less_greater((ir_relation.ir_relation_less.val | ir_relation.ir_relation_greater.val)),
		ir_relation_less_equal_greater(((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val)),
		ir_relation_unordered_equal((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_less((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val)),
		ir_relation_unordered_less_equal(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_greater((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_greater.val)),
		ir_relation_unordered_greater_equal(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_greater.val) | ir_relation.ir_relation_equal.val)),
		ir_relation_unordered_less_greater(((ir_relation.ir_relation_unordered.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val)),
		ir_relation_true((((ir_relation.ir_relation_equal.val | ir_relation.ir_relation_less.val) | ir_relation.ir_relation_greater.val) | ir_relation.ir_relation_unordered.val));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_relation(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_relation() {
			this.val = C.next_val++;
		}

		public static ir_relation getEnum(int val) {
			for (ir_relation entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_cons_flags {
		cons_none(0),
		cons_volatile((1 << 0)),
		cons_unaligned((1 << 1)),
		cons_floats((1 << 2)),
		cons_throws_exception((1 << 3));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_cons_flags(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_cons_flags() {
			this.val = C.next_val++;
		}

		public static ir_cons_flags getEnum(int val) {
			for (ir_cons_flags entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum op_pin_state {
		op_pin_state_floats(0),
		op_pin_state_pinned(1),
		op_pin_state_exc_pinned();
		public final int val;

		private static class C {
			static int next_val;
		}

		op_pin_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		op_pin_state() {
			this.val = C.next_val++;
		}

		public static op_pin_state getEnum(int val) {
			for (op_pin_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum cond_jmp_predicate {
		COND_JMP_PRED_NONE(),
		COND_JMP_PRED_TRUE(),
		COND_JMP_PRED_FALSE();
		public final int val;

		private static class C {
			static int next_val;
		}

		cond_jmp_predicate(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		cond_jmp_predicate() {
			this.val = C.next_val++;
		}

		public static cond_jmp_predicate getEnum(int val) {
			for (cond_jmp_predicate entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum mtp_additional_properties {
		mtp_no_property(0),
		mtp_property_no_write((1 << 0)),
		mtp_property_pure((1 << 1)),
		mtp_property_noreturn((1 << 2)),
		mtp_property_terminates((1 << 3)),
		mtp_property_nothrow((1 << 4)),
		mtp_property_naked((1 << 5)),
		mtp_property_malloc((1 << 6)),
		mtp_property_returns_twice((1 << 7)),
		mtp_property_private((1 << 8)),
		mtp_property_always_inline((1 << 9)),
		mtp_property_noinline((1 << 10)),
		mtp_property_inline_recommended((1 << 11)),
		mtp_temporary((1 << 12));
		public final int val;

		private static class C {
			static int next_val;
		}

		mtp_additional_properties(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		mtp_additional_properties() {
			this.val = C.next_val++;
		}

		public static mtp_additional_properties getEnum(int val) {
			for (mtp_additional_properties entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_builtin_kind {
		ir_bk_trap(),
		ir_bk_debugbreak(),
		ir_bk_return_address(),
		ir_bk_frame_address(),
		ir_bk_prefetch(),
		ir_bk_ffs(),
		ir_bk_clz(),
		ir_bk_ctz(),
		ir_bk_popcount(),
		ir_bk_parity(),
		ir_bk_bswap(),
		ir_bk_inport(),
		ir_bk_outport(),
		ir_bk_saturating_increment(),
		ir_bk_compare_swap(),
		ir_bk_may_alias(),
		ir_bk_va_start(),
		ir_bk_va_arg(),
		ir_bk_last(ir_builtin_kind.ir_bk_va_arg.val);
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_builtin_kind(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_builtin_kind() {
			this.val = C.next_val++;
		}

		public static ir_builtin_kind getEnum(int val) {
			for (ir_builtin_kind entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_volatility {
		volatility_non_volatile(),
		volatility_is_volatile();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_volatility(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_volatility() {
			this.val = C.next_val++;
		}

		public static ir_volatility getEnum(int val) {
			for (ir_volatility entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_align {
		align_is_aligned(0),
		align_non_aligned();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_align(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_align() {
			this.val = C.next_val++;
		}

		public static ir_align getEnum(int val) {
			for (ir_align entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_alias_relation {
		ir_no_alias(),
		ir_may_alias(),
		ir_sure_alias();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_alias_relation(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_alias_relation() {
			this.val = C.next_val++;
		}

		public static ir_alias_relation getEnum(int val) {
			for (ir_alias_relation entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_entity_usage_computed_state {
		ir_entity_usage_not_computed(),
		ir_entity_usage_computed();
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_entity_usage_computed_state(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_entity_usage_computed_state() {
			this.val = C.next_val++;
		}

		public static ir_entity_usage_computed_state getEnum(int val) {
			for (ir_entity_usage_computed_state entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}

	public static enum ir_disambiguator_options {
		aa_opt_none(0),
		aa_opt_always_alias((1 << 0)),
		aa_opt_type_based((1 << 1)),
		aa_opt_byte_type_may_alias((1 << 2)),
		aa_opt_no_alias((1 << 3)),
		aa_opt_inherited((1 << 4));
		public final int val;

		private static class C {
			static int next_val;
		}

		ir_disambiguator_options(int val) {
			this.val = val;
			C.next_val = val + 1;
		}

		ir_disambiguator_options() {
			this.val = C.next_val++;
		}

		public static ir_disambiguator_options getEnum(int val) {
			for (ir_disambiguator_options entry : values()) {
				if (val == entry.val)
					return entry;
			}
			return null;
		}
	}


	public static native String get_ir_alias_relation_name(/* ir_alias_relation */int rel);

	public static native /* ir_alias_relation */int get_alias_relation(Pointer addr1, Pointer type1, int size1, Pointer addr2, Pointer type2, int size2);

	public static native void assure_irg_entity_usage_computed(Pointer irg);

	public static native /* ir_entity_usage_computed_state */int get_irp_globals_entity_usage_state();

	public static native void set_irp_globals_entity_usage_state(/* ir_entity_usage_computed_state */int state);

	public static native void assure_irp_globals_entity_usage_computed();

	public static native /* ir_disambiguator_options */int get_irg_memory_disambiguator_options(Pointer irg);

	public static native void set_irg_memory_disambiguator_options(Pointer irg, /* ir_disambiguator_options */int options);

	public static native void set_irp_memory_disambiguator_options(/* ir_disambiguator_options */int options);

	public static native void mark_private_methods();
}