// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * CidrBlock contains an optional name and one CIDR block.
 * 
 */
public final class CidrBlockResponse extends io.pulumi.resources.InvokeArgs {

    public static final CidrBlockResponse Empty = new CidrBlockResponse();

    /**
     * cidr_block must be specified in CIDR notation.
     * 
     */
    @InputImport(name="cidrBlock", required=true)
    private final String cidrBlock;

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * display_name is an optional field for users to identify CIDR blocks.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    public CidrBlockResponse(
        String cidrBlock,
        String displayName) {
        this.cidrBlock = Objects.requireNonNull(cidrBlock, "expected parameter 'cidrBlock' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
    }

    private CidrBlockResponse() {
        this.cidrBlock = null;
        this.displayName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CidrBlockResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidrBlock;
        private String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(CidrBlockResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder setCidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public CidrBlockResponse build() {
            return new CidrBlockResponse(cidrBlock, displayName);
        }
    }
}
