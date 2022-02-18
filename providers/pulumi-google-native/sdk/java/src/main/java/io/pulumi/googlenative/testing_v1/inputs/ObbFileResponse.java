// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An opaque binary blob file to install on the device before the test starts.
 * 
 */
public final class ObbFileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ObbFileResponse Empty = new ObbFileResponse();

    /**
     * Opaque Binary Blob (OBB) file(s) to install on the device.
     * 
     */
    @InputImport(name="obb", required=true)
    private final FileReferenceResponse obb;

    public FileReferenceResponse getObb() {
        return this.obb;
    }

    /**
     * OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on the device.
     * 
     */
    @InputImport(name="obbFileName", required=true)
    private final String obbFileName;

    public String getObbFileName() {
        return this.obbFileName;
    }

    public ObbFileResponse(
        FileReferenceResponse obb,
        String obbFileName) {
        this.obb = Objects.requireNonNull(obb, "expected parameter 'obb' to be non-null");
        this.obbFileName = Objects.requireNonNull(obbFileName, "expected parameter 'obbFileName' to be non-null");
    }

    private ObbFileResponse() {
        this.obb = null;
        this.obbFileName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObbFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileReferenceResponse obb;
        private String obbFileName;

        public Builder() {
    	      // Empty
        }

        public Builder(ObbFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.obb = defaults.obb;
    	      this.obbFileName = defaults.obbFileName;
        }

        public Builder setObb(FileReferenceResponse obb) {
            this.obb = Objects.requireNonNull(obb);
            return this;
        }

        public Builder setObbFileName(String obbFileName) {
            this.obbFileName = Objects.requireNonNull(obbFileName);
            return this;
        }

        public ObbFileResponse build() {
            return new ObbFileResponse(obb, obbFileName);
        }
    }
}
