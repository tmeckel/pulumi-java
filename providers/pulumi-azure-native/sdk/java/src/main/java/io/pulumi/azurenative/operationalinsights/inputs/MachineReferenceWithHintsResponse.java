// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A machine reference with a hint of the machine's name and operating system.
 * 
 */
public final class MachineReferenceWithHintsResponse extends io.pulumi.resources.InvokeArgs {

    public static final MachineReferenceWithHintsResponse Empty = new MachineReferenceWithHintsResponse();

    /**
     * Last known display name.
     * 
     */
    @InputImport(name="displayNameHint", required=true)
      private final String displayNameHint;

    public String getDisplayNameHint() {
        return this.displayNameHint;
    }

    /**
     * Resource URI.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Specifies the sub-class of the reference.
     * Expected value is 'ref:machinewithhints'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Resource name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Last known operating system family.
     * 
     */
    @InputImport(name="osFamilyHint", required=true)
      private final String osFamilyHint;

    public String getOsFamilyHint() {
        return this.osFamilyHint;
    }

    /**
     * Resource type qualifier.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public MachineReferenceWithHintsResponse(
        String displayNameHint,
        String id,
        String kind,
        String name,
        String osFamilyHint,
        String type) {
        this.displayNameHint = Objects.requireNonNull(displayNameHint, "expected parameter 'displayNameHint' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.osFamilyHint = Objects.requireNonNull(osFamilyHint, "expected parameter 'osFamilyHint' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MachineReferenceWithHintsResponse() {
        this.displayNameHint = null;
        this.id = null;
        this.kind = null;
        this.name = null;
        this.osFamilyHint = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineReferenceWithHintsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayNameHint;
        private String id;
        private String kind;
        private String name;
        private String osFamilyHint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineReferenceWithHintsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayNameHint = defaults.displayNameHint;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.osFamilyHint = defaults.osFamilyHint;
    	      this.type = defaults.type;
        }

        public Builder displayNameHint(String displayNameHint) {
            this.displayNameHint = Objects.requireNonNull(displayNameHint);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder osFamilyHint(String osFamilyHint) {
            this.osFamilyHint = Objects.requireNonNull(osFamilyHint);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public MachineReferenceWithHintsResponse build() {
            return new MachineReferenceWithHintsResponse(displayNameHint, id, kind, name, osFamilyHint, type);
        }
    }
}
