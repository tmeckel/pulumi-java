// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The instance view of a virtual machine boot diagnostics.
 * 
 */
public final class BootDiagnosticsInstanceViewResponse extends com.pulumi.resources.InvokeArgs {

    public static final BootDiagnosticsInstanceViewResponse Empty = new BootDiagnosticsInstanceViewResponse();

    /**
     * The console screenshot blob URI. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
     * 
     */
    @Import(name="consoleScreenshotBlobUri", required=true)
    private String consoleScreenshotBlobUri;

    /**
     * @return The console screenshot blob URI. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
     * 
     */
    public String consoleScreenshotBlobUri() {
        return this.consoleScreenshotBlobUri;
    }

    /**
     * The serial console log blob Uri. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
     * 
     */
    @Import(name="serialConsoleLogBlobUri", required=true)
    private String serialConsoleLogBlobUri;

    /**
     * @return The serial console log blob Uri. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
     * 
     */
    public String serialConsoleLogBlobUri() {
        return this.serialConsoleLogBlobUri;
    }

    /**
     * The boot diagnostics status information for the VM. &lt;br&gt;&lt;br&gt; NOTE: It will be set only if there are errors encountered in enabling boot diagnostics.
     * 
     */
    @Import(name="status", required=true)
    private InstanceViewStatusResponse status;

    /**
     * @return The boot diagnostics status information for the VM. &lt;br&gt;&lt;br&gt; NOTE: It will be set only if there are errors encountered in enabling boot diagnostics.
     * 
     */
    public InstanceViewStatusResponse status() {
        return this.status;
    }

    private BootDiagnosticsInstanceViewResponse() {}

    private BootDiagnosticsInstanceViewResponse(BootDiagnosticsInstanceViewResponse $) {
        this.consoleScreenshotBlobUri = $.consoleScreenshotBlobUri;
        this.serialConsoleLogBlobUri = $.serialConsoleLogBlobUri;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BootDiagnosticsInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BootDiagnosticsInstanceViewResponse $;

        public Builder() {
            $ = new BootDiagnosticsInstanceViewResponse();
        }

        public Builder(BootDiagnosticsInstanceViewResponse defaults) {
            $ = new BootDiagnosticsInstanceViewResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param consoleScreenshotBlobUri The console screenshot blob URI. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
         * 
         * @return builder
         * 
         */
        public Builder consoleScreenshotBlobUri(String consoleScreenshotBlobUri) {
            $.consoleScreenshotBlobUri = consoleScreenshotBlobUri;
            return this;
        }

        /**
         * @param serialConsoleLogBlobUri The serial console log blob Uri. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
         * 
         * @return builder
         * 
         */
        public Builder serialConsoleLogBlobUri(String serialConsoleLogBlobUri) {
            $.serialConsoleLogBlobUri = serialConsoleLogBlobUri;
            return this;
        }

        /**
         * @param status The boot diagnostics status information for the VM. &lt;br&gt;&lt;br&gt; NOTE: It will be set only if there are errors encountered in enabling boot diagnostics.
         * 
         * @return builder
         * 
         */
        public Builder status(InstanceViewStatusResponse status) {
            $.status = status;
            return this;
        }

        public BootDiagnosticsInstanceViewResponse build() {
            $.consoleScreenshotBlobUri = Objects.requireNonNull($.consoleScreenshotBlobUri, "expected parameter 'consoleScreenshotBlobUri' to be non-null");
            $.serialConsoleLogBlobUri = Objects.requireNonNull($.serialConsoleLogBlobUri, "expected parameter 'serialConsoleLogBlobUri' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
