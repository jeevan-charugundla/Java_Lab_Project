import { motion } from 'motion/react';
import { Github, Terminal, FolderOpen, FileCode, CheckCircle2, ChevronRight, Package } from 'lucide-react';

export default function App() {
  return (
    <div className="min-h-screen bg-black text-[#c9d1d9] font-sans flex items-center justify-center p-4 sm:p-8">
      <div className="w-full max-w-5xl flex flex-col bg-[#0d1117] overflow-hidden rounded-xl border border-[#30363d] shadow-2xl">
        
        {/* Header Section */}
        <header className="flex items-center justify-between px-6 py-4 bg-[#161b22] border-b border-[#30363d]">
          <motion.div 
            initial={{ opacity: 0, y: -10 }}
            animate={{ opacity: 1, y: 0 }}
            className="flex items-center gap-3"
          >
            <div className="w-10 h-10 bg-[#f89820] rounded flex items-center justify-center font-bold text-[#161b22]">
              <Package className="w-6 h-6" />
            </div>
            <div>
              <h1 className="text-lg font-bold text-white leading-tight">
                Java Project Generated
              </h1>
              <p className="text-xs text-[#8b949e]">
                Your console-based Movie Ticket Booking System has been scaffolded.
              </p>
            </div>
          </motion.div>
          <div className="hidden sm:flex items-center gap-2">
            <div className="flex items-center gap-1.5 px-3 py-1 bg-[#21262d] rounded border border-[#30363d] text-[11px] font-medium text-[#c9d1d9]">
               <span className="w-2 h-2 rounded-full bg-green-400"></span> Scaffolded
            </div>
          </div>
        </header>

        <div className="flex-1 flex flex-col p-6 gap-6">
          {/* Action Grid */}
          <div className="grid md:grid-cols-2 gap-6">
            
            <motion.div 
              initial={{ opacity: 0, x: -20 }}
              animate={{ opacity: 1, x: 0 }}
              transition={{ delay: 0.1 }}
              className="flex flex-col bg-[#161b22] border border-[#30363d] rounded-lg overflow-hidden"
            >
              <div className="flex items-center px-4 py-2 border-b border-[#30363d] bg-[#0d1117]">
                <FolderOpen className="w-4 h-4 text-[#8b949e] mr-2" />
                <h2 className="text-xs font-bold text-[#8b949e] uppercase tracking-wider">Review the Code</h2>
              </div>
              <div className="p-5 flex-1 flex flex-col">
                <p className="text-[13px] text-[#e6edf3] mb-4 leading-relaxed">
                  All the <code className="text-orange-300">.java</code> files have been generated applying strict OOP concepts (Inheritance, Polymorphism, Encapsulation, Interface) exactly as requested.
                </p>
                <div className="bg-black rounded-lg border border-[#30363d] p-4 font-mono text-[11px] text-[#8b949e] shadow-inner mt-auto">
                  <div className="flex items-center text-[#c9d1d9] mb-2 font-bold">
                    <ChevronRight className="w-3 h-3 mr-1" /> Movie-Ticket-Booking-System
                  </div>
                  <div className="pl-4 space-y-1.5">
                    <div className="flex items-center"><FileCode className="w-3.5 h-3.5 mr-2 text-[#f89820]" /> src/main/Main.java</div>
                    <div className="flex items-center"><FileCode className="w-3.5 h-3.5 mr-2 text-blue-400" /> src/model/*.java</div>
                    <div className="flex items-center"><FileCode className="w-3.5 h-3.5 mr-2 text-purple-400" /> src/service/*.java</div>
                    <div className="flex items-center"><FileCode className="w-3.5 h-3.5 mr-2 text-[#8b949e]" /> README.md</div>
                  </div>
                </div>
              </div>
            </motion.div>

            <motion.div 
              initial={{ opacity: 0, x: 20 }}
              animate={{ opacity: 1, x: 0 }}
              transition={{ delay: 0.2 }}
              className="flex flex-col bg-[#161b22] border border-[#30363d] rounded-lg overflow-hidden"
            >
              <div className="flex items-center px-4 py-2 border-b border-[#30363d] bg-[#0d1117]">
                <Github className="w-4 h-4 text-[#8b949e] mr-2" />
                <h2 className="text-xs font-bold text-[#8b949e] uppercase tracking-wider">Export to GitHub</h2>
              </div>
              <div className="p-5 flex-1 flex flex-col">
                <p className="text-[13px] text-[#e6edf3] mb-4 leading-relaxed">
                  Use the built-in AI Studio export tools to push this complete project, including the comprehensive README, directly to your GitHub account or download it locally.
                </p>
                
                <div className="mt-auto space-y-3 bg-[#0d1117] p-4 rounded-lg border border-[#30363d]">
                  <div className="flex items-start space-x-2 text-[12px] text-[#c9d1d9]">
                    <CheckCircle2 className="w-4 h-4 text-green-400 shrink-0 mt-0.5" />
                    <span>Open the <strong className="text-white">Settings</strong> button in the top right menu of AI Studio.</span>
                  </div>
                  <div className="flex items-start space-x-2 text-[12px] text-[#c9d1d9]">
                    <CheckCircle2 className="w-4 h-4 text-green-400 shrink-0 mt-0.5" />
                    <span>Select <strong className="text-white">Export to GitHub</strong> or <strong className="text-white">Download ZIP</strong>.</span>
                  </div>
                  <div className="flex items-start space-x-2 text-[12px] text-[#c9d1d9]">
                    <CheckCircle2 className="w-4 h-4 text-green-400 shrink-0 mt-0.5" />
                    <span>Open it in IntelliJ / VS Code and compile <code className="bg-black border border-[#30363d] px-1 py-0.5 rounded text-blue-300 font-mono">Main.java</code>!</span>
                  </div>
                </div>
              </div>
            </motion.div>

          </div>

          {/* Terminal Hint */}
          <motion.div 
            initial={{ opacity: 0, scale: 0.95 }}
            animate={{ opacity: 1, scale: 1 }}
            transition={{ delay: 0.3 }}
            className="flex flex-col bg-black border border-[#30363d] rounded-lg overflow-hidden shadow-2xl"
          >
            <div className="flex items-center justify-between px-4 py-2 bg-[#161b22] border-b border-[#30363d] text-[11px] font-mono text-[#8b949e]">
              <div className="flex items-center gap-2">
                <span>Terminal — java Main</span>
              </div>
              <span>Ready</span>
            </div>
            <div className="p-5 font-mono text-[13px] leading-relaxed">
               <div className="flex items-center gap-2 mb-2">
                 <Terminal className="w-4 h-4 text-green-400" />
                 <h3 className="text-green-400 font-bold">$ Ready to run?</h3>
               </div>
               <p className="text-[#e6edf3]">
                 Because this is a Java terminal application, it cannot be run directly inside this Node.js sandbox environment.
               </p>
               <p className="text-[#8b949e] mt-2">
                 Download the code and compile it locally using <code className="text-blue-400 bg-[#0d1117] px-1 py-0.5 rounded">javac</code> and run with <code className="text-blue-400 bg-[#0d1117] px-1 py-0.5 rounded">java main.Main</code>.
               </p>
            </div>
          </motion.div>

        </div>
        
        {/* Footer */}
        <footer className="h-8 bg-[#161b22] border-t border-[#30363d] flex items-center px-4 justify-between text-[11px] text-[#8b949e] font-mono">
           <div className="flex gap-4">
              <span>Java OOP project generated</span>
           </div>
           <div className="flex gap-4">
              <span>UTF-8</span>
              <span>Java</span>
           </div>
        </footer>

      </div>
    </div>
  );
}

