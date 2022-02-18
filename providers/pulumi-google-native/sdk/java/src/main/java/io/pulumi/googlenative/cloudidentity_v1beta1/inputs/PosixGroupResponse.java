// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * POSIX Group definition to represent a group in a POSIX compliant system.
 * 
 */
public final class PosixGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final PosixGroupResponse Empty = new PosixGroupResponse();

    /**
     * GID of the POSIX group.
     * 
     */
    @InputImport(name="gid", required=true)
    private final String gid;

    public String getGid() {
        return this.gid;
    }

    /**
     * Name of the POSIX group.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * System identifier for which group name and gid apply to. If not specified it will default to empty value.
     * 
     */
    @InputImport(name="systemId", required=true)
    private final String systemId;

    public String getSystemId() {
        return this.systemId;
    }

    public PosixGroupResponse(
        String gid,
        String name,
        String systemId) {
        this.gid = Objects.requireNonNull(gid, "expected parameter 'gid' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.systemId = Objects.requireNonNull(systemId, "expected parameter 'systemId' to be non-null");
    }

    private PosixGroupResponse() {
        this.gid = null;
        this.name = null;
        this.systemId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PosixGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gid;
        private String name;
        private String systemId;

        public Builder() {
    	      // Empty
        }

        public Builder(PosixGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.name = defaults.name;
    	      this.systemId = defaults.systemId;
        }

        public Builder setGid(String gid) {
            this.gid = Objects.requireNonNull(gid);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSystemId(String systemId) {
            this.systemId = Objects.requireNonNull(systemId);
            return this;
        }

        public PosixGroupResponse build() {
            return new PosixGroupResponse(gid, name, systemId);
        }
    }
}
